package com.zfy.lafguiyond.service;

import com.zfy.lafguiyond.entities.SysUser;
import com.zfy.lafguiyond.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceTest {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void reg(){
        SysUser sysUser = new SysUser();
        sysUser.setSysName("guiyondddd");
        sysUser.setSysPhone("123123");
        sysUser.setSysPassword("123123");
        sysUserService.reg(sysUser);
        System.out.println("success");
    }

    @Test
    public void login(){
        SysUser result = sysUserService.login("guiyond", "123123");
        System.out.println(result);
    }

}
