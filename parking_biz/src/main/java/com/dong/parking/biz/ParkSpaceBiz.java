package com.dong.parking.biz;

import com.dong.parking.entity.ParkSpace;

import java.util.List;
/**
*   停车位的业务操作
*   @author albert
*   @date 2019/6/14
*
*/
public interface ParkSpaceBiz {
    void add(ParkSpace parkSpace);

    void edit(ParkSpace parkSpace);

    void remove(Integer id);

    ParkSpace findById(Integer id);

    List<ParkSpace> findAll();

    List<ParkSpace> findByStatus(int status);


}
