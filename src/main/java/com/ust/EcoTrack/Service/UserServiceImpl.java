package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.UserRepository;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements  UserService{

    @Autowired
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
        if (userRepo.existsById(id)) {
            User existingUser = userRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("User Does not Exist"));

            existingUser.setUserName(user.getUserName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setAge(user.getAge());
            existingUser.setReminderFrequency(user.getReminderFrequency());

            return userRepo.save(existingUser);
        } else {
            throw new RuntimeException("User Does not Exist");
        }
    }


    @Override
    public void deleteUser(int id) {
        if(userRepo.existsById(id)){
            userRepo.deleteById(id);
        }else{
            throw new RuntimeException("User Does not Exist");
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
