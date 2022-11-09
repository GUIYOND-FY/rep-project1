package com.zfy.lafguiyond.service.impl;

import com.zfy.lafguiyond.entities.SysUser;
import com.zfy.lafguiyond.entities.User;
import com.zfy.lafguiyond.mapper.SysUserMapper;
import com.zfy.lafguiyond.service.SysUserService;
import com.zfy.lafguiyond.service.ex.InsertException;
import com.zfy.lafguiyond.service.ex.PasswordNotMatchException;
import com.zfy.lafguiyond.service.ex.UserNotFoundException;
import com.zfy.lafguiyond.service.ex.UsernameDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void reg(SysUser sysUser) {
        SysUser result = sysUserMapper.queryBySysUsername(sysUser.getSysName());
        if(result != null){
            throw new UsernameDuplicatedException("该用户已存在");
        }
        Date date = new Date();
        sysUser.setCreateTime(date);
        sysUser.setIsDelete(0);
        Integer rows = sysUserMapper.insert(sysUser);
        if(rows!=1){
            throw new InsertException("添加数据时产生未知错误");
        }
    }

    @Override
    public SysUser login(String sysName, String sysPassword) {
        SysUser result = sysUserMapper.queryBySysUsername(sysName);
        if (result == null) {
            throw new UserNotFoundException("用户数据不存在的错误");
        }
        if (result.getIsDelete() == 1) {
            throw new UserNotFoundException("用户数据不存在的错误");
        }
        if (!result.getSysPassword().equals(sysPassword)) {
            throw new PasswordNotMatchException("密码验证失败的错误");
        }
        SysUser sysUser = new SysUser();
        sysUser.setSysId(result.getSysId());
        sysUser.setSysName(result.getSysName());
        return sysUser;
    }
}
