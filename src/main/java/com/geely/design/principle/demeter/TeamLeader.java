package com.geely.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 15:15 2019/10/8
 */
public class TeamLeader {

    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i=0;i< 20;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+ courseList.size());
    }
}
