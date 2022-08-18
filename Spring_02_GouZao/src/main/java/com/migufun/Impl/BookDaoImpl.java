package com.migufun.Impl;

import com.migufun.Dao.BookDao;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:04:36
 * @description
 */
public class BookDaoImpl implements BookDao {
    private int count;
    private String name;

    // 添加多个简单数据类型


    public BookDaoImpl(int count, String name) {
        this.count = count;
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("BookDao save....");
        System.out.println("name: " + name + "，count：" + count);
    }

}
