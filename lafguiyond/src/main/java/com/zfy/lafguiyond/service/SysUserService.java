package com.zfy.lafguiyond.service;

import com.zfy.lafguiyond.entities.SysUser;
import com.zfy.lafguiyond.entities.User;

public interface SysUserService {
    void reg(SysUser sysUser);

    SysUser login(String sysName, String sysPassword);
}
