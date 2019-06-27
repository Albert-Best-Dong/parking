package com.dong.parking.entity;

import java.util.Date;

/**
*   费用账单，用于统计停车费
*   @author albert
*   @date 2019/5/31
*
*/
public class Bill {
    private int id;
    private Integer parkInfoId;
//    private double money;
    private int type;               //收取方式
//    private Date payTime;           //付款时间
//    private Date entryTime;
//    private Date depatureTime;
    private String operator;

    private ParkInfo parkInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }




    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getParkInfoId() {
        return parkInfoId;
    }

    public void setParkInfoId(Integer parkInfoId) {
        this.parkInfoId = parkInfoId;
    }

    public ParkInfo getParkInfo() {
        return parkInfo;
    }

    public void setParkInfo(ParkInfo parkInfo) {
        this.parkInfo = parkInfo;
    }
}
