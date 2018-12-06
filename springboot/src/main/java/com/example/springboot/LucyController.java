package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LucyController {
    @Autowired
    ConfigBean configBean;

    @Autowired
    User user;
    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
    @RequestMapping(value = "/user")
    public String user(){
        return "i'm,"+user.getName()+"-"+user.getAge();
    }
}
