package com.geely.design.pattern.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArtcile() {
        return new PythonArticle();
    }
}
