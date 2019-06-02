package com.dong.parking.biz.impl;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.dao.ParkInfoDao;
import com.dong.parking.entity.ParkInfo;
import com.dong.parking.entity.ParkSpace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("parkInfoBiz")
public class ParkInfoBizImpl implements ParkInfoBiz {

    @Qualifier("parkInfoDao")
    @Autowired
    private ParkInfoDao parkInfoDao;

    public void entry(ParkInfo parkInfo) {
        Date entryTime = new Date();
        parkInfo.setParkIn(entryTime);
        ParkSpace parkSpace = parkInfo.getParkSpace();
        parkInfoDao.insert(parkInfo);

    }

    public List<ParkInfo> findByParkId(String parkId) {
        return null;
    }

    public ParkInfo findById(int id) {
        return null;
    }

    public ParkInfo findByCarId(String carId) {
        return null;
    }

    public double getFee(Date beginTime, Date endTime) {
        double hours = 0;
        long begin = beginTime.getTime();
        long end = endTime.getTime();
        long diff = end - begin;
        hours = (diff / (60 * 60 * 1000));

        if (hours <= 2) {
            return 5;
        }else{
            return (5 + (hours - 2) * 2);
        }


    }

    public void departure(ParkInfo parkInfo) {
        Date departureTime = new Date();
        parkInfo.setParkOut(departureTime);
        double fee = getFee(parkInfo.getParkIn(), departureTime);
        parkInfo.setFee(fee);
        parkInfoDao.update(parkInfo);
    }
}
