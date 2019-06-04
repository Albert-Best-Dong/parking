package com.dong.parking.controller;

import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.entity.ParkSpace;
import com.dong.parking.entity.User;
import com.dong.parking.global.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller("parkSpaceController")
@RequestMapping("/parkSpace")
public class ParkSpaceController {
    @Autowired
    private ParkSpaceBiz parkSpaceBiz;

    @RequestMapping(value = "/list")
    public String list(Map<String,Object> map,@RequestParam(value = "status",required = false) Integer status) {

        if (status == null) {
            map.put("list", parkSpaceBiz.findAll());
        } else {
            map.put("list", parkSpaceBiz.findByStatus(status));
        }
        return "park_space_list";
    }

    @RequestMapping("/to_update")
    public String toUpdate(Map<String, Object> map,@RequestParam int id) {
        map.put("floor", Constant.getFloor());
        map.put("area", Constant.getArea());
        map.put("parkSpace", parkSpaceBiz.findById(id));
        return "park_space_update";
    }
    @RequestMapping("/update")
    public String update(ParkSpace parkSpace,HttpSession session) {
        User user = (User)session.getAttribute("user");
        parkSpace.setUpdateBy(user.getSn());
        parkSpaceBiz.edit(parkSpace);
        return "redirect:list";
    }


    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("floor", Constant.getFloor());
        map.put("area", Constant.getArea());
        map.put("parkSpace", new ParkSpace());
        return "park_space_add";
    }
    @RequestMapping("/add")
    public String add(ParkSpace parkSpace, HttpSession session) {
        User user = (User)session.getAttribute("user");
        parkSpace.setCreateBy(user.getSn());
        parkSpace.setUpdateBy(user.getSn());
        parkSpaceBiz.add(parkSpace);
        return "redirect:list";
    }



    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id) {
        parkSpaceBiz.remove(id);
        return "redirect:list";
    }
}
