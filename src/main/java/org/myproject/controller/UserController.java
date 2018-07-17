package org.myproject.controller;

import org.myproject.pojo.User;
import org.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuser")
    @ResponseBody
    public User getUser(){
        User user = userService.getUser(1);

//        System.out.println(user.toString());
        return user;
    }
}
