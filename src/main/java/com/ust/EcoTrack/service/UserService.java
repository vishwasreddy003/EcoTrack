package com.ust.EcoTrack.service;


import com.ust.EcoTrack.model.User;

import java.util.List;

public interface UserService {
    public User editUser(String username, User user);

    public void deleteUser(String username);

    public User getUserByUsername(String username);

    public List<User> getTop10GreenScoreUsers();
}
