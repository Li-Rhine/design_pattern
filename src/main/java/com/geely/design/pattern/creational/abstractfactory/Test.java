package com.geely.design.pattern.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArtcile();
        video.produce();
        article.produce();
    }
}
