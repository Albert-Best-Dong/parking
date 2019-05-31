package com.dong.parking.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
/**
*   停车位具体信息
*   @author albert
*   @date 2019/5/31
*
*/

public class ParkInfo {

    private int id;                 //停车信息id
    private String spaceId;          //车位号
    private int cardId;             //卡号
    private String carId;           //车牌号
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date parkIn;            //停车时间
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date parkOut;           //取车时间
    private int fee;                //停车费

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
