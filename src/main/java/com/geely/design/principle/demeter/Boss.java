package com.geely.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 15:15 2019/10/8
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
//        List<Course> courseList = new ArrayList<Course>();
//        for (int i=0;i< 20;i++){
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberOfCourse();
    }
}
