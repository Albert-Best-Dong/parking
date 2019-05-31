package com.dong.parking.dao;

import com.dong.parking.entity.ParkSpace;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ParkSpaceDao {
    void insert(ParkSpace parkSpace);

    void insert(ParkSpace parkSpace, int[] num);

    void update(ParkSpace parkSpace);

    ParkSpace select(int id);

    ParkSpace selectBySpaceId(String spaceId);

    List<ParkSpace> selectAll();

    List<ParkSpace> selectByStatus();

    void delete(int id);
}
