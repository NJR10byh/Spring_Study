package com.migufun.Impl;

import com.migufun.Dao.BookDao;
import com.migufun.Service.BookService;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:31:34
 * @description
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void run() {
        System.out.println("BookService run.....");
        bookDao.save();
    }
}
