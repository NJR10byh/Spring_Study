package com.migufun.factory;

import com.migufun.Impl.UserDaoImpl;
import com.migufun.dao.UserDao;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author NJR10byh
 * @date 2022/8/15 14:31:53
 * @description FactoryBean
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    // 返回所创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 返回是否单例模式（默认单例），此方法一般不需要重写
    // public boolean isSingleton() {
    //     return true;
    // }
}
