package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
        User findByUserName(String userName);

        @Query("SELECT u FROM User u ORDER BY u.green_score DESC")
        List<User> getLeaderBoard();

        @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.userName = :username")
        boolean existsByUserName(String username);

        @Modifying
        @Query("DELETE FROM User u WHERE u.userName = :username")
        void deleteByUsername(String username);
}
