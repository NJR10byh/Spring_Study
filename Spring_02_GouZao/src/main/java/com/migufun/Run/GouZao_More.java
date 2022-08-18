package com.migufun.Run;

import com.migufun.Service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/19 00:50:51
 * @description 构造器注入多个参数
 */
public class GouZao_More {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserService userService = (UserService) ctx.getBean("UserService");
        BookService bookService = (BookService) ctx.getBean("BookService");

        // userService.run();
        bookService.run();
    }
}
