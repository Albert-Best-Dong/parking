package com.dong.parking.biz.impl;

import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.dao.ParkSpaceDao;
import com.dong.parking.dao.UserDao;
import com.dong.parking.entity.ParkSpace;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("parkSpaceBiz")
public class ParkSpaceBizImpl implements ParkSpaceBiz {

    @Autowired
    private ParkSpaceDao parkSpaceDao;
    @Autowired
    private UserDao userDao;
    public void add(ParkSpace parkSpace) {
        Date initTime = new Date();
        parkSpace.setCreateTime(initTime);
        parkSpace.setUpdateTime(initTime);
        parkSpace.setStatus(0);

        parkSpaceDao.insert(parkSpace);
    }

    public void edit(ParkSpace parkSpace) {
        parkSpace.setUpdateTime(new Date());
        parkSpaceDao.update(parkSpace);
    }

    public void remove(Integer id) {
        parkSpaceDao.delete(id);
    }

    public ParkSpace findById(Integer id) {
        return parkSpaceDao.select(id);
    }

    public List<ParkSpace> findAll() {
        return parkSpaceDao.selectAll();
    }

    public List<ParkSpace> findByStatus(int status) {
        return parkSpaceDao.selectByStatus(status);
    }
}
