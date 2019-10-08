package com.geely.design.pattern.creational.factorymethod;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 16:00 2019/10/8
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
