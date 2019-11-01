package com.geely.design.pattern.structural.facade;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 14:50 2019/11/1
 */
public class ShippingService {
    public String shipGift(PointGift pointGift){
        //物流系统的对接逻辑
        System.out.println(pointGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
