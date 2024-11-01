package com.ust.EcoTrack.Service;


import com.ust.EcoTrack.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public User editUser(int id,User user);

    public void deleteUser(int id,User user);

    public User getUserByUsername(String username);

    public List<User> getTop10GreenScoreUsers();
}
