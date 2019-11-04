package com.geely.design.pattern.structural.decorator.v1;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:22 2019/11/4
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+ "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+ 1;
    }
}
