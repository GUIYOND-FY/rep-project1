package com.zfy.lafguiyond.mapper;

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
public class SysUserMapperTest {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void insert(){
        SysUser sysUser = new SysUser();
        sysUser.setCreateTime(new Date());
        sysUser.setSysName("guiyonddd");
        sysUser.setIsDelete(0);
        sysUser.setSysPhone("123123");
        sysUser.setSysPassword("123123");
        sysUserMapper.insert(sysUser);
        System.out.println("success");
    }

    @Test
    public void findBySysUsername(){
        SysUser u = sysUserMapper.queryBySysUsername("guiyond");
        System.out.println(u);
    }


}
