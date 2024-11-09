package com.ust.EcoTrack.controller;

import com.ust.EcoTrack.service.UserService;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack")
public class UserController {

    @Autowired
    private UserService userService;



    @PutMapping("/{username}/edit")
    public ResponseEntity<User> editUser(@PathVariable String username, @RequestBody User user) {
        User updatedUser = userService.editUser(username, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{username}/delete")
    public ResponseEntity<Void> deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        User user = userService.getUserByUsername(username);
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/leaderBoard")
    public ResponseEntity<List<User>> getTop10GreenScoreUsers() {
        List<User> leaderboard = userService.getTop10GreenScoreUsers();
        return new ResponseEntity<>(leaderboard, HttpStatus.OK);
    }
}
