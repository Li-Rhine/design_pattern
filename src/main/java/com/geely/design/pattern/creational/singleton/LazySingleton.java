package com.geely.design.pattern.creational.singleton;

/**
 * 使用synchronized解决并发的问题
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    //synchronized如果加在static类上表示class文件上锁
    //如果不是static对象，表示在堆内存中上锁
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
