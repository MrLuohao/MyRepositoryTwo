package com.JdCollege.Test;

public class Singleton {
    /*
    枚举类型创建饿汉式单例设计模式
      enum Singgleton {
        singgleton;//枚举类型的构造方法都是私有化的
    }*/


    //创建多线程下可用的单例设计模式：懒汉式
    //1.私有化成员变量，设置为空，当调用时再实例化
    private static Singleton singleton = null;

    //2.私有化构造方法
    private Singleton() {
    }

    //3.提供共有的get方法将本类类型的引用返回给调用者
    public static Singleton getInstance() {
        //4.判断是否实例化
        if (singleton == null) {
            synchronized (Singleton.class) {//5.若为空，则上锁，保证单线程进来操作，防止多线程进入造成对象的多次实例化，就无法保证单例设计模式
                if (singleton == null) {//6.再次判断对象是否已实例化，双重判断
                    singleton = new Singleton();//7.若为实例化，则new一个本类类型的引用赋值给本类类型引用的成员变量
                }
            }
        }
        return singleton;//8.返回给调用者
    }
}
