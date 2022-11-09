package com.zfy.lafguiyond.service;

import com.zfy.lafguiyond.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;



    @Test
    public void login() {

            String username = "testDemo4";
            String password = "123456";
            User user = userService.login(username, password);
            System.out.println("登录成功！" + user);

    }

    @Test
    public void update(){
        User user = new User();
        user.setId(8);
        user.setUsername("666");
        user.setPassword("88888888");
        user.setPhone("123123");
        user.setQq("1111");
        user.setMail("123123@qq.com");
        userService.changeUserInfo(user);

    }

}
