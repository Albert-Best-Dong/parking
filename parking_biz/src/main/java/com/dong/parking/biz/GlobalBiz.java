package com.dong.parking.biz;

import com.dong.parking.entity.User;
/**
*   登录推出的一些操作
*   @author albert
*   @date 2019/6/14
*
*/
public interface GlobalBiz {
    User login(String sn, String password);
}
