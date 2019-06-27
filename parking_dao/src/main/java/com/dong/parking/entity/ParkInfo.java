package com.dong.parking.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
/**
*   停车具体信息
*   @author albert
*   @date 2019/5/31
*
*/

public class ParkInfo {

    private int id;                     //停车信息id
    private Integer parkSpaceId;                //车位号，应该由硬件设备采集传输到系统
    private Integer cardId;                 //卡号
    private String carId;               //车牌号
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date parkIn;                //停车时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date parkOut;               //取车时间
    private double fee;                 //停车费
    private int status;                 //汽车状态

    private ParkSpace parkSpace;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getParkSpaceId() {
        return parkSpaceId;
    }

    public void setParkSpaceId(Integer parkSpaceId) {
        this.parkSpaceId = parkSpaceId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Date getParkIn() {
        return parkIn;
    }

    public void setParkIn(Date parkIn) {
        this.parkIn = parkIn;
    }

    public Date getParkOut() {
        return parkOut;
    }

    public void setParkOut(Date parkOut) {
        this.parkOut = parkOut;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public ParkSpace getParkSpace() {
        return parkSpace;
    }

    public void setParkSpace(ParkSpace parkSpace) {
        this.parkSpace = parkSpace;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
