package com.migufun.run;

import com.migufun.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/15 15:32:52
 * @description bean生命周期
 */
public class AppForLifeCircle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        // 确保destory被执行
        ctx.registerShutdownHook();
    }
}
