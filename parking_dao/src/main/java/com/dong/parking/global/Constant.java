package com.dong.parking.global;

import java.util.ArrayList;
import java.util.List;

/**
*   常量类，定义一些必要常量
*   @author albert
*   @date 2019/5/30
*
*/
public class Constant {

    //车位状态
    public static final int EMPTY_SPACE = 0;         //"可使用车位"
    public static final int OCCUPIED_SPACE = 1;      //"已占用车位";
    public static final int RESERVED_SPACE = 2;      //"预定车位";

    //停车费信息
    public static final int INIT_FEE = 5;       //最初两小时5元
    public static final int INCREASE_FEE = 1;   //两小时后每半小时1元

    //停车场楼层
    public static final List<String> getFloor() {
        List<String> floorList = new ArrayList<String>();
        floorList.add("-1F ");

        floorList.add("-2F ");

        floorList.add("-3F ");
        return floorList;
    }

    //停车场区域
    public static final List<String> getArea() {
        List<String> area = new ArrayList<String>();
        area.add("A");
        area.add("B");
        area.add("C");
        area.add("D");
        area.add("E");
        return area;
    }


    //汽车的状态
    public static final int STOP= 0;       //停在车位
    public static final int LEAVE= 1;     //离开车位

}
