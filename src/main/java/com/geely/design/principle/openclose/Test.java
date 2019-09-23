package com.geely.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID: "+ javaDiscountCourse.getId() + "课程名称："+javaDiscountCourse.getName() +
                "课程原价："+javaDiscountCourse.getOriginPrice()+
                "折后价格："+javaDiscountCourse.getPrice());
    }
}
