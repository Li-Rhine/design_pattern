package com.geely.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {

    //禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1、分配内存
                    //2、初始化对象
                    //3、设置lazyDoubleCheckSingleton 指向刚分配的内存空间
                    //因为指令从排序，2和3的顺序可能颠倒
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
