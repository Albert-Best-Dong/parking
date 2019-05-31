package com.dong.parking.controller;

import com.dong.parking.biz.GlobalBiz;
import com.dong.parking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller("globalController")
public class GlobalController {
    @Autowired
    private GlobalBiz globalBiz;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn,@RequestParam String password) {

        User user = globalBiz.login(sn, password);

        if (user == null) {
            return "redirect:to_login";
        }
        session.setAttribute("user",user);
        return "self";
    }

    @RequestMapping("/self")
    public String self(){
        return  "self";
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.setAttribute("user",null);
        return "redirect:to_login";
    }
}
