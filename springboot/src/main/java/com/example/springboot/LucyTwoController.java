package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LucyTwoController {

    @Autowired
    ConfigBean configBean;


}
