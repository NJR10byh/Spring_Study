package com.migufun.Impl;

import com.migufun.Dao.UserDao;
import com.migufun.Service.UserService;

/**
 * @author NJR10byh
 * @date 2022/8/16 11:31:47
 * @description
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run() {
        System.out.println("UserService run......");
        userDao.save();
    }
}
