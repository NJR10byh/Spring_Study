package com.migufun.service;

import com.migufun.dao.BookDao;

/**
 * @author NJR10byh
 * @date 2022/8/14 20:59:59
 * @description
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao; // 删除业务层中使用new的方式创建的dao对象

    // 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("BookService save ...");
        bookDao.save();
    }
}
