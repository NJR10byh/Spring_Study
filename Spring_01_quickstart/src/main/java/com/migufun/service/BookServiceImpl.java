package com.migufun.service;

import com.migufun.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author NJR10byh
 * @date 2022/8/14 20:59:59
 * @description
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao; // 删除业务层中使用new的方式创建的dao对象

    // 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set BookDao");
        this.bookDao = bookDao;
    }


    public void save() {
        System.out.println("BookService save ...");
        bookDao.save();
    }

    @Override
    public void destroy() {
        System.out.println("Service distory~~~");
    }

    // 设置属性之后执行
    @Override
    public void afterPropertiesSet() {
        System.out.println("Service init~~~");
    }
}
