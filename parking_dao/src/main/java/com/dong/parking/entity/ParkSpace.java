package com.dong.parking.entity;
/**
*   车位
*   @author albert
*   @date 2019/5/31
*
*/
public class ParkSpace {
    private Integer id;
    private String spaceId;         //车位号
    private int status;             //车位状态：0可使用 1占用 2被预定
    private int totalNum;           //车位总数
    private int emptySpaceNum;     //剩余车位数
    private int reservedSpaceNum;  //被预定的车位数
    private int occupiedSpaceNum;  //被占用的车位数


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getEmptySpaceNum() {
        return emptySpaceNum;
    }

    public void setEmptySpaceNum(int emptySpaceNum) {
        this.emptySpaceNum = emptySpaceNum;
    }

    public int getReservedSpaceNum() {
        return reservedSpaceNum;
    }

    public void setReservedSpaceNum(int reservedSpaceNum) {
        this.reservedSpaceNum = reservedSpaceNum;
    }

    public int getOccupiedSpaceNum() {
        return occupiedSpaceNum;
    }

    public void setOccupiedSpaceNum(int occupiedSpaceNum) {
        this.occupiedSpaceNum = occupiedSpaceNum;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
