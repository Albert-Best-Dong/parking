package com.dong.parking.biz.impl;

import com.dong.parking.biz.BillBiz;
import com.dong.parking.dao.BillDao;
import com.dong.parking.entity.Bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("billBiz")
public class BillBizImpl implements BillBiz {

    @Autowired
    private BillDao billDao;


    public void add(Bill bill) {

        billDao.insert(bill);
    }

    public List<Bill> selectByCarId(String carId) {
        return billDao.selectByCarId(carId);
    }

    public List<Bill> findAll() {
        return billDao.selectAll();
    }
}
