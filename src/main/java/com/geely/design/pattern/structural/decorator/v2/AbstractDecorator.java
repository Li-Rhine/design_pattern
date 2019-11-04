package com.geely.design.pattern.structural.decorator.v2;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:42 2019/11/4
 */
public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
