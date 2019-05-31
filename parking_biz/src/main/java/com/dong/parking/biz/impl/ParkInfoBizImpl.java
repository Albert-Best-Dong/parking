package com.dong.parking.biz.impl;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.dao.ParkInfoDao;
import com.dong.parking.entity.ParkInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("parkInfoBiz")
public class ParkInfoBizImpl implements ParkInfoBiz {

    @Qualifier("parkInfoDao")
    @Autowired
    private ParkInfoDao parkInfoDao;

    public void add(ParkInfo parkInfo) {

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
}
