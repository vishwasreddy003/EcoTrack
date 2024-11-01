package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.UserRepository;
import com.ust.EcoTrack.model.User;

import java.util.List;

public class UserServiceImpl implements  UserService{

    private UserRepository userRepo;

    @Override
    public User saveUser(User user) {
        if(!userRepo.existsById(user.getUser_id())){
            return userRepo.save(user);
        }else{
            throw new RuntimeException("User Already Exist");
        }
    }

    @Override
    public User editUser(int id, User user) {
        if(!userRepo.existsById(id)){
            return userRepo.save(user);
        }else{
            throw new RuntimeException("User Does not Exist");
        }
    }

    @Override
    public void deleteUser(int id, User user) {
        if(!userRepo.existsById(id)){
            userRepo.delete(user);
        }else{
            throw new RuntimeException("User Does not Exist");
        }
    }

    @Override
    public User getUserByUsername(String username) {

        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getTop10GreenScoreUsers() {
        return List.of();
    }
}