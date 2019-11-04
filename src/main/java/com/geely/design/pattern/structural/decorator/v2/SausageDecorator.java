package com.geely.design.pattern.structural.decorator.v2;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:45 2019/11/4
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2 ;
    }
}
