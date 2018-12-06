package com.example.springboot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDaoImpl {
    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key ,String value){
        ValueOperations<String,String> ops=template.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES);
    }
    public String getValue(String key){
        ValueOperations<String,String> ops=this.template.opsForValue();
        return ops.get(key);

    }
}
