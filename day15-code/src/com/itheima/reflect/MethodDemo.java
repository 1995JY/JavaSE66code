package com.itheima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodDemo {
    /*
        通过反射获取类的成员方法进行使用
     */
    public static void main(String[] args) throws Exception {

        // 1. 获取类的字节码对象
        Class<?> personClass = Class.forName("com.itheima.domain.Person");

        Constructor<?> constructor = personClass.getConstructor();
        Object o = constructor.newInstance();

        // 2. 通过字节码对象获取成员方法
        Method eatMethod1 = personClass.getMethod("eat");
        Method eatMethod2 = personClass.getMethod("eat", int.class);

        // 3. 通过成员方法对象, 让方法执行起来
        eatMethod1.invoke(o);
        eatMethod2.invoke(o, 10);

    }
}
