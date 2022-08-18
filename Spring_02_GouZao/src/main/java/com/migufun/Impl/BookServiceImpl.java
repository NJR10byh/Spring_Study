package com.migufun.Impl;

import com.migufun.Dao.BookDao;
import com.migufun.Dao.UserDao;
import com.migufun.Service.BookService;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:31:34
 * @description
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    // 添加多个引用数据类型
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void run() {
        System.out.println("BookService run.....");
        bookDao.save();
        userDao.save();
    }
}
