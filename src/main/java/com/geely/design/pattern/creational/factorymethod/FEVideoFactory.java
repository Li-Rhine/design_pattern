package com.geely.design.pattern.creational.factorymethod;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:53 2019/10/8
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
