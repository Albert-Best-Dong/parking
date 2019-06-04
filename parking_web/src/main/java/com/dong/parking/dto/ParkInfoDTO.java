package com.dong.parking.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ParkInfoDTO {
    private int id;                 //停车信息id
    private String spaceId;          //车位号，应该由硬件设备采集传输到系统
    private int cardId;             //卡号
    private String carId;           //车牌号
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date parkIn;            //停车时间
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date parkOut;           //取车时间
    private double fee;                //停车费
}
