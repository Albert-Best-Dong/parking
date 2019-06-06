package com.dong.parking.biz;

import com.dong.parking.entity.ParkInfo;

import java.util.Date;
import java.util.List;

public interface ParkInfoBiz {
    public void entry(ParkInfo parkInfo);

    public List<ParkInfo> findBySpaceId(String spaceId);

    public ParkInfo findById(int id);

    public List<ParkInfo> findByCarId(String carId);

    public List<ParkInfo> findAll();

    public List<ParkInfo> findByStatus(Integer status);

    public void departure(ParkInfo parkInfo);

    public void toDeparture(ParkInfo parkInfo);
}
