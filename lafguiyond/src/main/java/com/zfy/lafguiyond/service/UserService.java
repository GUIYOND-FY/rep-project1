package com.zfy.lafguiyond.service;

import com.zfy.lafguiyond.entities.User;

public interface UserService {
    void reg(User user);

    User login(String username, String password);

    void changeUserInfo(User user);
}
