package com.dong.parking.dao;

import com.dong.parking.entity.Bill;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillDao {
    void insert(Bill bill);

    List<Bill> selectAll();

    List<Bill>  selectByCarId(String carId);

}
