package com.geely.design.pattern.creational.singleton;

// 单例-静态内部类
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    //基于类初始化的延迟加载解决方案
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
