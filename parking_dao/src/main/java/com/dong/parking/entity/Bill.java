package com.dong.parking.entity;

import java.util.Date;

/**
*   费用账单
*   @author albert
*   @date 2019/5/31
*
*/
public class Bill {
    private int id;
    private double money;
    private int type;               //收取方式
    private Date payTime;           //付款时间
    private String carId;           //车牌号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
