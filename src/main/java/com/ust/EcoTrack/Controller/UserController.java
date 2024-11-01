package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.UserService;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/${userId}/edit")
    public User editUser(@PathVariable int userId,@RequestBody User user){
        return userService.editUser(userId,user);
    }

    @DeleteMapping("/${userId}/delete")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/leaderBoard")
    public List<User> getTop10GreenScoreUsers() {
        return userService.getTop10GreenScoreUsers();
    }




}
