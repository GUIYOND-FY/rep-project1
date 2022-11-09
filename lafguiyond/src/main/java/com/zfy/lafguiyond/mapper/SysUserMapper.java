package com.zfy.lafguiyond.mapper;

import com.zfy.lafguiyond.entities.SysUser;
import com.zfy.lafguiyond.entities.User;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    Integer insert(SysUser sysUser);

    SysUser queryBySysUsername(@Param("sysName") String sysName);

}
