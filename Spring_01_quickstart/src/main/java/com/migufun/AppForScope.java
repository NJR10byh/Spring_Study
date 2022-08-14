package com.migufun;

import com.migufun.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author NJR10byh
 * @date 2022/8/14 23:47:03
 * @description 测试 bean 别名配置
 */
public class AppForScope {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 验证IOC容器中对象是否为单例
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);

        /**
         * bookDao1 和 bookDao2 地址完全相同
         * 默认情况下，Spring创建的bean对象都是`单例`的
         */
    }
}
