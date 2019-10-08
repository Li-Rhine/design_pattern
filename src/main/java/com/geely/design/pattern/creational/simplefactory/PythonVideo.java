package com.geely.design.pattern.creational.simplefactory;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 16:02 2019/10/8
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
