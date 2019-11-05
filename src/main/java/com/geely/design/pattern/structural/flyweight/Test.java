package com.geely.design.pattern.structural.flyweight;


public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
//        for (int i=0;i<10;i++){
//            String department = departments[(int) (Math.random()*departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//        }


        // 测试Integer享元模式，内部有缓存，如果超过范围就new对象，用 ==判断会false
        // Integer、Long类型都存在缓存，为 -128~127
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        Integer e = new Integer(100);
        System.out.println("b==e:" + (b==e));

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+ (a==b));
        System.out.println("c==d:"+ (c==d));

    }
}
