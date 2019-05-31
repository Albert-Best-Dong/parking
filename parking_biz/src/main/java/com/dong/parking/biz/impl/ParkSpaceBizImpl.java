package com.dong.parking.biz.impl;

import com.dong.parking.biz.ParkSpaceBiz;
import com.dong.parking.dao.ParkSpaceDao;
import com.dong.parking.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service("parkSpaceBiz")
public class ParkSpaceBizImpl implements ParkSpaceBiz {

    @Autowired
    private ParkSpaceDao parkSpaceDao;
    @Autowired
    private UserDao userDao;
    public void add(ParkSpaceBiz parkSpace) {

    }

    public void edit(ParkSpaceBiz parkSpace) {

    }

    public void remove(Integer id) {

    }

    public List<ParkSpaceBiz> findAll() {
        return null;
    }

    public List<ParkSpaceBiz> findByStatus(int status) {
        return null;
    }
}
