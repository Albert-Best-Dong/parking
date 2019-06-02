package com.dong.parking.biz;

import com.dong.parking.entity.ParkInfo;

import java.util.Date;
import java.util.List;

public interface ParkInfoBiz {
    public void entry(ParkInfo parkInfo);

    public List<ParkInfo> findByParkId(String parkId);

    public ParkInfo findById(int id);

    public ParkInfo findByCarId(String carId);

    public double getFee(Date beginTime,Date endTime);

    public void departure(ParkInfo parkInfo);
}
