package com.dong.parking.controller;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.entity.ParkInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("parkInfoController")
@RequestMapping("/parkInfo")
public class ParkInfoController {

    @Autowired
    private ParkSpaceBiz parkSpaceBiz;

    @Autowired
    private ParkInfoBiz parkInfoBiz;

    /**
    *
    *   正常的情况为：汽车进入停车场，入口处自动采集车辆信息录入系统，同时将车位与车辆绑定，此处留作接口
    *
    *   作为测试，先进行手动输入
    *
    */

    @RequestMapping("/add")
    public String add() {

        return "redirect:list";
    }

    //汽车离开停车场，需要变更车位状态，计算费用，设置离开时间
    @RequestMapping("/update")
    public String departure(ParkInfo parkInfo) {
        parkInfoBiz.departure(parkInfo);
        return "redirect:list";
    }
}
