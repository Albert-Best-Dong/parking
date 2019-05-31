package com.dong.parking.biz;

import com.dong.parking.entity.User;

public interface GlobalBiz {
    User login(String sn, String password);
}
