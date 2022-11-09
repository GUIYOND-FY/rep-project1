package com.zfy.lafguiyond.controller;

import com.zfy.lafguiyond.entities.User;
import com.zfy.lafguiyond.service.UserService;
import com.zfy.lafguiyond.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("users")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        userService.reg(user);
        return new JsonResult<>(OK);
    }

    @RequestMapping("login")
    public JsonResult<User> login(String username, String password, HttpSession session) {
        User data = userService.login(username, password);
        session.setAttribute("id",data.getId());
        session.removeAttribute("sysid");
        return new JsonResult<User>(OK, data);
    }

    @RequestMapping("update")
    public JsonResult<Void> changeUserInfo(User user,HttpSession session){
        Integer id = Integer.valueOf(session.getAttribute("id").toString());
        user.setId(id);
        userService.changeUserInfo(user);
        return new JsonResult<>(OK);
    }

}
