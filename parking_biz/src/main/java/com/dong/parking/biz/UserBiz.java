package com.dong.parking.biz;

import com.dong.parking.entity.User;

import java.util.List;

public interface UserBiz {
    void add(User user);

    void edit(User user);

    User get(String sn);

    List<User> getAll();

    void remove(String sn);
}
