package com.migufun.run;

import com.migufun.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/14 23:47:03
 * @description 测试 bean 别名配置
 */
public class AppForName {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();

        // 使用 bookService 的别名service
        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();
    }
}
