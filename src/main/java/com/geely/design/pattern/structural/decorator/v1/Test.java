package com.geely.design.pattern.structural.decorator.v1;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 10:29 2019/11/4
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格：" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格：" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格：" + battercakeWithEggSausage.cost());
    }
}
