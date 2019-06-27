package com.dong.parking.biz.impl;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.dao.ParkInfoDao;
import com.dong.parking.entity.ParkInfo;
import com.dong.parking.entity.ParkSpace;
import com.dong.parking.global.Constant;
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
    @Autowired
    private ParkSpaceBiz parkSpaceBiz;          //变更车位状态

    //进入停车场
    public void entry(ParkInfo parkInfo) {
        parkInfo.setStatus(Constant.STOP);          //设置车辆状态为泊车
        parkInfo.setFee(0);
        parkInfoDao.insert(parkInfo);
        //变更停车位状态为占用
        ParkSpace parkSpace = parkSpaceBiz.findById(parkInfo.getParkSpaceId());
        parkSpace.setStatus(Constant.OCCUPIED_SPACE);
        parkSpaceBiz.edit(parkSpace);
    }
    //根据车位号查找
    public List<ParkInfo> findBySpaceId(String spaceId) {
        return parkInfoDao.selectBySpaceId(spaceId);
    }

    public ParkInfo findById(int id) {
        return parkInfoDao.select(id);
    }
    //根据车牌查找
    public List<ParkInfo> findByCarId(String carId) {
        return parkInfoDao.selectByCarId(carId);
    }

    public List<ParkInfo> findAll() {
        return parkInfoDao.selectAll();
    }

    public List<ParkInfo> findByStatus(Integer status) {
        return parkInfoDao.selectByStatus(status);
    }

    //计算费用
    private double getFee(Date beginTime, Date endTime) {
        double hours = 0;
        long begin = beginTime.getTime();
        long end = endTime.getTime();
        long diff = end - begin;
        hours = (diff / (60 * 60 * 1000));

        if (hours <= 2) {
            return Constant.INIT_FEE;
        }else{
            return (Constant.INIT_FEE + (hours - 2) * Constant.INCREASE_FEE*2);
        }


    }

    //准备离开车库，计算停车费
    public void toDeparture(ParkInfo parkInfo) {
        Date departureTime = new Date();
        parkInfo.setParkOut(departureTime);

        double fee = getFee(parkInfo.getParkIn(), parkInfo.getParkOut());
        parkInfo.setFee(fee);
        parkInfoDao.update(parkInfo);
    }
    //离开车库，进行更新
    public void departure(ParkInfo parkInfo) {
        parkInfo.setStatus(Constant.LEAVE);     //设置车辆状态为离开
        parkInfoDao.update(parkInfo);

        //获取需要更新的parkSpace
        ParkSpace parkSpace = parkSpaceBiz.findById(parkInfo.getParkSpaceId());
        parkSpace.setStatus(Constant.EMPTY_SPACE);      //变更停车为状态为空闲

        parkSpaceBiz.edit(parkSpace);
    }


}
