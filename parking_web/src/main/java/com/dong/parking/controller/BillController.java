package com.dong.parking.controller;

import com.dong.parking.biz.BillBiz;
import com.dong.parking.entity.Bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("billController")
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillBiz billBiz;

    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        List<Bill> list = billBiz.findAll();

        map.put("list", list);

        return "bill_list";
    }
}
