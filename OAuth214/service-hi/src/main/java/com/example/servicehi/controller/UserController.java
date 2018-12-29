package com.example.servicehi.controller;

import com.example.servicehi.domain.User;
import com.example.servicehi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping()
    public User createUser(@RequestParam("userName") String userName,@RequestParam("passWord") String password){
        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);
        return userService.create(user);

    }

}
