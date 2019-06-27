package com.dong.parking.global;

import com.dong.parking.biz.ParkInfoBiz;
import com.dong.parking.biz.ParkSpaceBiz;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OperationAspect {
    @Autowired
    private ParkInfoBiz parkInfoBiz;
    @Autowired
    private ParkSpaceBiz parkSpaceBiz;
}
