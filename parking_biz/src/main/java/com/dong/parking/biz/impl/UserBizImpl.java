package com.dong.parking.biz.impl;

import com.dong.parking.biz.UserBiz;
import com.dong.parking.dao.UserDao;
import com.dong.parking.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userBiz")
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserDao userDao;

    public void add(User user) {
        user.setPassword("000000");
        userDao.insert(user);
    }

    public void edit(User user) {
        userDao.update(user);
    }

    public User get(String sn) {
        return userDao.select(sn);
    }

    public List<User> getAll() {
        return userDao.selectAll();
    }

    public void remove(String sn) {
        userDao.delete(sn);
    }
}
