package com.example.springboot;

import com.example.springboot.dao.impl.RedisDaoImpl;
import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Test
    public void contextLoads(){

    }
    @Autowired
    RedisDaoImpl redisDao;
    @Test
    public void testRedisDao(){
        redisDao.setKey("name","wxf");
        redisDao.setKey("age","17");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }
}
