package com.dong.parking.controller;

import com.dong.parking.biz.UserBiz;
import com.dong.parking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserBiz userBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map) {
        map.put("list", userBiz.getAll());

        return "user_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("user", new User());
        return "user_add";
    }
    @RequestMapping("/add")
    public String add(User user) {
        userBiz.add(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpdate(String sn,Map<String, Object> map) {
        map.put("user", userBiz.get(sn));
        return "user_update";
    }
    @RequestMapping("/update")
    public String update(User user) {
        userBiz.edit(user);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "sn")
    public String remove(String sn) {
        userBiz.remove(sn);
        return "redirect:list";
    }
}
