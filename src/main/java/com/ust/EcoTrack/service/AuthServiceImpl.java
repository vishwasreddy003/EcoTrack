package com.ust.EcoTrack.service;

import com.ust.EcoTrack.exceptions.UserAlreadyExistsException;
import com.ust.EcoTrack.exceptions.UserDoesNotExistException;
import com.ust.EcoTrack.model.User;
import com.ust.EcoTrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {

    @Autowired
    private UserRepository userRepo;

    public void saveUser(User user) {
        if(userRepo.existsByUserName(user.getUserName())){
            throw new UserAlreadyExistsException("User with username Already Exist");
        } else if (userRepo.existsByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("User with email Already Exist. Please Login");
        } else{
            userRepo.save(user);
        }
    }

    public User findByEmail(String email) {
        return userRepo.existsByEmail(email).orElseThrow(() -> new UserDoesNotExistException("User not found"));
    }


}
