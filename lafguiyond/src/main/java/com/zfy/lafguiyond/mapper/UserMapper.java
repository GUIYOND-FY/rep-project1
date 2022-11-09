package com.zfy.lafguiyond.mapper;

import com.zfy.lafguiyond.entities.Found;
import com.zfy.lafguiyond.entities.User;

import java.util.List;

public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String username);

    Integer changeUserInfo(User user);

    User findById(Integer id);
}
