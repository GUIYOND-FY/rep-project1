package com.zfy.lafguiyond.controller;

import com.zfy.lafguiyond.entities.SysUser;
import com.zfy.lafguiyond.entities.User;
import com.zfy.lafguiyond.service.SysUserService;
import com.zfy.lafguiyond.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("sysusers")
public class SysUserController extends BaseController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(SysUser sysUser) {
        sysUserService.reg(sysUser);
        return new JsonResult<>(OK);
    }

    @RequestMapping("login")
    public JsonResult<SysUser> login(String sysName, String sysPassword,HttpSession session) {
        SysUser data = sysUserService.login(sysName, sysPassword);
        session.setAttribute("sysid",data.getSysId());
        session.removeAttribute("id");
        return new JsonResult<>(OK, data);
    }

    @RequestMapping("manage")
    public JsonResult<Integer> manage(HttpSession session){
        if(session.getAttribute("id")!=null){
            return new JsonResult<>(OK, 0);
        }
        return new JsonResult<>(OK, 1);
    }
}
