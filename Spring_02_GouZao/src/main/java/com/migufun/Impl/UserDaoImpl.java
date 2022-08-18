package com.migufun.Impl;

import com.migufun.Dao.UserDao;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:06:58
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDao save.....");
    }
}
