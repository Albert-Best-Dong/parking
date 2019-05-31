package com.dong.parking.biz.impl;

import com.dong.parking.biz.GlobalBiz;
import com.dong.parking.dao.UserDao;
import com.dong.parking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {
    @Autowired
    private UserDao userDao;

    public User login(String sn, String password) {
        User user = userDao.select(sn);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
