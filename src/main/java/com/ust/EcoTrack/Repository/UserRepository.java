package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


        User findByUserName(String userName);

        @Query("SELECT u FROM User u ORDER BY u.green_score DESC")
        List<User> getLeaderBoard();
}
