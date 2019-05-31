package com.dong.parking.dao;

import com.dong.parking.entity.ParkInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("parkInfoDao")
public interface ParkInfoDao {
    void insert(ParkInfo parkInfo);

    void update(ParkInfo parkInfo);

    ParkInfo select(int id);

    List<ParkInfo> selectAll();

    List<ParkInfo> selectBySpaceId(String spaceId);     //根据停车位查询

    ParkInfo selectByCarId(String CarId);           //根据车牌号查询
}
