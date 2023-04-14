package com.itheima.reflct;

import java.lang.reflect.Constructor;


/*
如何使用字节码对象获得构造方法并生成实例对象
 */
public class ReflctDemo02 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.itheima.domain.Student");
        Constructor<?> constructor1 = aClass.getConstructor();
        Constructor<?> constructor2 = aClass.getConstructor(String.class,int.class);
        Object o1 = constructor1.newInstance();
        Object o2 = constructor2.newInstance("张三", 23);
        System.out.println(o1);
        System.out.println(o2);

    }
}
