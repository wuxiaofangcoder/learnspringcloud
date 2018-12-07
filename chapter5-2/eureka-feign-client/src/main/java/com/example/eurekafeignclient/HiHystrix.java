package com.example.eurekafeignclient;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi,"+name+", Sorry I am  HiHystrix";
    }
}
