package com.dong.parking.biz;

import com.dong.parking.entity.Bill;

import java.util.List;

public interface BillBiz {
    public void add(Bill bill);

    public List<Bill> selectByCarId(String carId);

    List<Bill> findAll();
}
