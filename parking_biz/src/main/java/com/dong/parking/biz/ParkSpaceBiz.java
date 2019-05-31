package com.dong.parking.biz;

import java.util.List;

public interface ParkSpaceBiz {
    void add(ParkSpaceBiz parkSpace);

    void edit(ParkSpaceBiz parkSpace);

    void remove(Integer id);

    List<ParkSpaceBiz> findAll();

    List<ParkSpaceBiz> findByStatus(int status);


}
