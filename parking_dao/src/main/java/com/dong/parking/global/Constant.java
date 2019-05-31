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

    //停车场区域
    public static final List<String> getPosition() {
        List<String> list = new ArrayList<String>();
        list.add("负一楼 A");
        list.add("负一楼 B");
        list.add("负一楼 C");
        list.add("负一楼 D");
        list.add("负一楼 E");
        list.add("负二楼 A");
        list.add("负二楼 B");
        list.add("负二楼 C");
        list.add("负二楼 D");
        list.add("负二楼 E");
        list.add("负三楼 A");
        list.add("负三楼 B");
        list.add("负三楼 C");
        list.add("负三楼 D");
        list.add("负三楼 E");
        return list;
    }



}
