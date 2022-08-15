package com.migufun.Impl;

import com.migufun.dao.UserDao;

/**
 * @author NJR10byh
 * @date 2022/8/15 14:33:05
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save ...");
    }
}
