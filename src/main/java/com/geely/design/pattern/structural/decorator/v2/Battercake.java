package com.geely.design.pattern.structural.decorator.v2;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:40 2019/11/4
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
