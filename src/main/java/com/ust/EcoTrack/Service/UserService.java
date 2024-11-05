package com.ust.EcoTrack.Service;


import com.ust.EcoTrack.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    public User saveUser(User user);

    public User editUser(String username, User user);

    public void deleteUser(String username);

    public User getUserByUsername(String username);

    public List<User> getTop10GreenScoreUsers();
}
