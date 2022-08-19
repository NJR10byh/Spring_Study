package com.migufun.Run;

import com.migufun.Service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:02:28
 * @description 构造器注入
 */
public class CollectionInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserService userService = (UserService) ctx.getBean("UserService");
        BookService bookService = (BookService) ctx.getBean("bookService");

        // userService.run();
        bookService.run();
    }
}
