package com.ust.EcoTrack.controller;

import com.ust.EcoTrack.dto.LoginDto;
import com.ust.EcoTrack.dto.SignupDto;
import com.ust.EcoTrack.model.User;
import com.ust.EcoTrack.service.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/EcoTrack")
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    private final PasswordEncoder passwordEncoder;

    @PostMapping("/signup")
    public ResponseEntity<?> addUser(@RequestBody SignupDto signupDto){
        User newUser = new User();
        newUser.setUserName(signupDto.getUsername());
        newUser.setEmail(signupDto.getEmail());
        newUser.setPassword(passwordEncoder.encode(signupDto.getPassword()));
        newUser.setAge(signupDto.getAge());
        authService.saveUser(newUser);
        return ResponseEntity.ok(Map.of("message","Signup Successful"));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginRequest) {
        User user = authService.findByEmail(loginRequest.getEmail());

        if (user == null || !passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        return ResponseEntity.ok(Map.of("message", "Login successful"));
    }
}
