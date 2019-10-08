package com.geely.design.pattern.creational.simplefactory;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 16:03 2019/10/8
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null){
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produce();
    }
}
