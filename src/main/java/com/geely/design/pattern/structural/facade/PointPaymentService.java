package com.geely.design.pattern.structural.facade;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 14:48 2019/11/1
 */
public class PointPaymentService {
    public boolean pay(PointGift pointGift){
        //扣减积分
        System.out.println("支付"+ pointGift.getName() + " 积分成功");
        return true;
    }
}
