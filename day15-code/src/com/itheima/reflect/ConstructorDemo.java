package com.itheima.reflect;

import com.itheima.domain.Person;

import java.lang.reflect.Constructor;

public class ConstructorDemo {
    /*
        通过反射类的构造方法, 来创建对象
        ----------------------------------------
        重点: 实际开发中, 严格禁止暴力反射
     */
    public static void main(String[] args) throws Exception {
        // 1. 获取类的字节码对象 (尸体)
        Class<Person> personClass = Person.class;

        // 2. 反射构造方法 (暴力反射)
        Constructor<Person> constructor1 = personClass.getDeclaredConstructor();
        // 设置访问权限
        constructor1.setAccessible(true);

        Constructor<Person> constructor2 = personClass.getDeclaredConstructor(String.class, int.class);
        constructor2.setAccessible(true);

        // 3. 创建对象
        Person p1 = constructor1.newInstance();
        Person p2 = constructor2.newInstance("张三", 23);

        System.out.println(p1);
        System.out.println(p2);
    }

    private static void method() throws Exception {
        // 1. 获取到类的字节码对象
        Class<?> stuClass = Class.forName("com.itheima.domain.Student");

        // 2. 通过字节码对象获取   空参构造方法
        Constructor<?> constructor1 = stuClass.getConstructor();

        // 3. 通过字节码对象获取   带参构造方法
        Constructor<?> constructor2 = stuClass.getConstructor(String.class, int.class);

        // 4. 通过反射得到的构造方法, 来创建对象
        Object o1 = constructor1.newInstance();
        System.out.println(o1);

        Object o2 = constructor2.newInstance("张三", 23);
        System.out.println(o2);

        System.out.println("------------------------------------------");


        Constructor<?>[] constructors = stuClass.getConstructors();

        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
    }
}
