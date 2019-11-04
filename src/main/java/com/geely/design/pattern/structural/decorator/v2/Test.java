package com.geely.design.pattern.structural.decorator.v2;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 11:22 2019/11/4
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDescorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(battercake.getDesc() + " 销售价格：" + battercake.cost());
    }
}
