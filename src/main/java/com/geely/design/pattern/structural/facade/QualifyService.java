package com.geely.design.pattern.structural.facade;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 14:09 2019/11/1
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验" + pointGift.getName()+" 积分资格通过，库存通过");
        return true;
    }
}
