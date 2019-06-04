package com.dong.parking.controller;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.entity.ParkInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller("parkInfoController")
@RequestMapping("/parkInfo")
public class ParkInfoController {

    @Autowired
    private ParkSpaceBiz parkSpaceBiz;

    @Autowired
    private ParkInfoBiz parkInfoBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map, @RequestParam(value = "carId",required = false)String carId) {


        if (parkInfoBiz.findByCarId(carId).isEmpty()) {
            map.put("list", parkInfoBiz.findAll());
        }else{
            map.put("list", parkInfoBiz.findByCarId(carId));
        }


        return "park_info_list";
    }

    /**
     * 正常的情况为：汽车进入停车场，入口处自动采集车辆信息录入系统，同时将车位与车辆绑定，此处留作接口
     *
     * 作为测试，先进行手动输入
     */

    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("parkInfo", new ParkInfo());
        return "park_info_add";
    }

    @RequestMapping("/add")
    public String add() {

        return "redirect:list";
    }

    @RequestMapping("to_update")
    public String toDeparture(Map<String, Object> map, @RequestParam(value = "id") Integer id) {
        map.put("parkInfo", parkInfoBiz.findById(id));

        return "/park_info_departure";
    }


    //汽车离开停车场，需要变更车位状态，计算费用，设置离开时间
    @RequestMapping("/update")
    public String departure(ParkInfo parkInfo) {
        parkInfoBiz.departure(parkInfo);
        return "redirect:list";
    }

}
