package com.geely.design.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //防止序列化破坏单例模式（内部原因是因为序列化内部采用了反射获取对象，所以会出现不是同一个对象的情况）
    private Object readResolve(){
        return hungrySingleton;
    }
}
