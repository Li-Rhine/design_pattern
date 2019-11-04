package com.geely.design.pattern.structural.decorator.v1;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:24 2019/11/4
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
