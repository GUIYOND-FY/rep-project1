package com.zfy.lafguiyond.service.impl;

import com.zfy.lafguiyond.entities.User;
import com.zfy.lafguiyond.mapper.UserMapper;
import com.zfy.lafguiyond.service.UserService;
import com.zfy.lafguiyond.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void reg(User user) {
        User result = userMapper.findByUsername(user.getUsername());
        if(result!=null){
            throw new UsernameDuplicatedException("该用户名已被占用");
        }
        Date date = new Date();
        user.setCreateTime(date);
        user.setIsDelete(0);
        Integer rows = userMapper.insert(user);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public User login(String username, String password){
        User result = userMapper.findByUsername(username);
        if (result == null) {
            throw new UserNotFoundException("用户数据不存在的错误");
        }
        if (result.getIsDelete() == 1) {
            throw new UserNotFoundException("用户数据不存在的错误");
        }
        if (!result.getPassword().equals(password)) {
            throw new PasswordNotMatchException("密码验证失败的错误");
        }
        User user = new User();
        user.setId(result.getId());
        user.setUsername(result.getUsername());
        return user;
    }

    @Override
    public void changeUserInfo(User user) {
        Integer id = user.getId();
        User result = userMapper.findById(id);
        if(result == null){
            throw new UserNotFoundException("用户不存在的异常");
        }
        if (result.getIsDelete() == 1) {
            throw new UserNotFoundException("用户数据不存在的错误");
        }
        Integer rows = userMapper.changeUserInfo(user);
        if(rows!=1){
            throw new UpdateException("修改数据时出现未知错误");
        }


    }


}
