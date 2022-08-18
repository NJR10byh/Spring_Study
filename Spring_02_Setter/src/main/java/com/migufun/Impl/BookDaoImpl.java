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

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void save() {
        System.out.println("BookDao save.... name: " + name + "count: " + count);
    }
}
