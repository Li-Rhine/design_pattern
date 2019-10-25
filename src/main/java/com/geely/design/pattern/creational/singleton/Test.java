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

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();


    }
}
