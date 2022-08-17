package com.migufun.Run;

import com.migufun.Service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:02:28
 * @description setter注入
 */
public class settterInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserService userService = (UserService) ctx.getBean("UserService");
        BookService bookService = (BookService) ctx.getBean("BookService");

        // userService.run();
        bookService.run();
    }
}
