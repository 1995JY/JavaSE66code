package com.itheima.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodTest {
    /*
        Java中的泛型是伪泛型
            - 泛型只在编译期间有效, 产生了字节码之后, 泛型就会被擦除

            需求: 创建一个ArrayList集合, 泛型为Integer类型, 向集合中添加一个字符串进去
     */
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(123);
        list.add(123);

        // 获取类的字节码对象
        Class<? extends ArrayList> aClass = list.getClass();

        // 反射集合的add方法
        Method addMethod = aClass.getMethod("add", Object.class);

        // invoke方法, 让add执行起来, 添加字符串
        addMethod.invoke(list, "abc");

        System.out.println(list);
    }
}
