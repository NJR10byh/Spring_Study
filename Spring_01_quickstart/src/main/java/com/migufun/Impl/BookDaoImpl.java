package com.migufun.Impl;

import com.migufun.dao.BookDao;

/**
 * @author NJR10byh
 * @date 2022/8/14 21:00:12
 * @description
 */
public class BookDaoImpl implements BookDao {
    public void init() {
        System.out.println("bean初始化 ...");
    }

    public void save() {
        System.out.println("BookDao save ...");
    }

    public void destroy() {
        System.out.println("bean销毁 ...");
    }
}
