package com.netease.kaola.test.spring;

import com.netease.kaola.study.config.Config;
import com.netease.kaola.study.config.DataBaseConfig;
import com.netease.kaola.study.config.DatabaseProperties;
import com.netease.kaola.study.entity.User;
import com.netease.kaola.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

public class TestSM02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class,DataBaseConfig.class);
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        System.out.println(userMapper.addUser(new User("sadasdf","213213")));
        DatabaseProperties properties = applicationContext.getBean(DatabaseProperties.class);
        System.out.println(properties);
    }

}
