package com.dong.parking.global;

import com.dong.parking.biz.BillBiz;
import com.dong.parking.entity.Bill;
import com.dong.parking.entity.ParkInfo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Date;

@Component
@Aspect
public class BillAdvice {
    @Autowired
    private BillBiz billBiz;


    @After("execution(* com.dong.parking.controller.ParkInfoController.departure(..))")
    public void generateBill(JoinPoint joinPoint) {
        System.out.println("后置增强");
        Object args[] = joinPoint.getArgs();
        System.out.println(joinPoint.getTarget().getClass().getSimpleName());
        ParkInfo parkInfo = null;
        for (int i = 0; i <args.length ; i++) {
            Object arg = args[0];
            System.out.println(arg);
            parkInfo = (ParkInfo) arg;

        }

        Bill bill = new Bill();
        bill.setParkInfoId(parkInfo.getId());
        bill.setType(2);
        bill.setOperator("admin");
        bill.setParkInfo(parkInfo);
        billBiz.add(bill);
    }
}
