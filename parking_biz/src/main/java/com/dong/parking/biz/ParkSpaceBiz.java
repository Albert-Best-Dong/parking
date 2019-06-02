package com.dong.parking.biz;

import com.dong.parking.entity.ParkSpace;

import java.util.List;

public interface ParkSpaceBiz {
    void add(ParkSpace parkSpace);

    void edit(ParkSpace parkSpace);

    void remove(Integer id);

    ParkSpace findById(Integer id);

    List<ParkSpace> findAll();

    List<ParkSpace> findByStatus(int status);


}
