package com.dong.parking.biz;

import com.dong.parking.entity.ParkInfo;

import java.util.List;

public interface ParkInfoBiz {
    public void add(ParkInfo parkInfo);

    public List<ParkInfo> findByParkId(String parkId);

    public ParkInfo findById(int id);

    public ParkInfo findByCarId(String carId);
}
