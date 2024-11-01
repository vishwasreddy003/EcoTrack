package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select * from users where username=:username")
    public User findByUsername(String username);
}
