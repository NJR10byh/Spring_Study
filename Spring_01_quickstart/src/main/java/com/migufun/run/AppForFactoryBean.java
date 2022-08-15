package com.migufun.run;

import com.migufun.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/15 14:39:33
 * @description FactoryBean实现类
 */
public class AppForFactoryBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        userDao1.save();
    }
}
