package com.netease.kaola.test.spring;

import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSM01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        System.out.println(userMapper.addUser(new User("tom","132155")));
    }
}
