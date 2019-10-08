package com.geely.design.pattern.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArtcile() {
        return new JavaArticle();
    }
}
