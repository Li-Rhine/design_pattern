package com.geely.design.pattern.creational.factorymethod;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:53 2019/10/8
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端视频");
    }
}
