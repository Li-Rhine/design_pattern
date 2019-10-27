package com.geely.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 使用synchronized解决并发的问题
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;
    private LazySingleton(){
        if (flag){
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    //synchronized如果加在static类上表示class文件上锁
    //如果不是static对象，表示在堆内存中上锁
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    //反射攻击
    public static void main(String[] args) throws Exception {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);

        LazySingleton o2 = (LazySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }

}
