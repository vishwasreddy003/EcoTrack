package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {


        User findByUserName(String userName);

        @Query("select u.username from eco_user u order by u.green_score")
        public List<User> getLeaderBoard();
}
