package com.ust.EcoTrack.service;

import com.ust.EcoTrack.exceptions.UserAlreadyExistsException;
import com.ust.EcoTrack.exceptions.UserDoesNotExistException;
import com.ust.EcoTrack.repository.UserRepository;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepo;




    @Override
    public User editUser(String username, User user) {
        if (userRepo.existsByUserName(username)) {
            User existingUser = userRepo.findByUserName(username);
            existingUser.setUserName(user.getUserName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setAge(user.getAge());
            existingUser.setReminderFrequency(user.getReminderFrequency());

            return userRepo.save(existingUser);
        } else {
            throw new UserDoesNotExistException("User Does not Exist");
        }
    }


    @Override
    public void deleteUser(String username) {

        if(userRepo.existsByUserName(username)){
            userRepo.deleteByUsername(username);
        }else{
            throw new UserDoesNotExistException("User Does not Exist");
        }
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepo.findByUserName(username);
    }

    @Override
    public List<User> getTop10GreenScoreUsers() {
        return userRepo.getLeaderBoard();
    }
}
