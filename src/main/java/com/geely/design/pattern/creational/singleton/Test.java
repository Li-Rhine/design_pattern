package com.geely.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("progam end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());


//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//
//        EnumInstance instance = (EnumInstance) constructor.newInstance("Geely", 666);





//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
////
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance == newInstance);

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();


//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("progam end");


//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);



        //类初始化阶段就生成对象的，包含StaticInnerClassSingleton（静态内部类），会有反射攻击
//        Class objectClass = HungrySingleton.class;

        Class objectClass = LazySingleton.class;


        //反射会调用私有的构造函数，如果反射的创建先执行，就不止一个对象
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();


//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton object = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
