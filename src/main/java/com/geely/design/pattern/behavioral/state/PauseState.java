package com.geely.design.pattern.behavioral.state;

public class PauseState extends CourseVideoState{
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
