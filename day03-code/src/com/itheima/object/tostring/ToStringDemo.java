package com.itheima.object.tostring;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class ToStringDemo {
    /*
        Object类中的toString方法 :

            public String toString() 返回该对象的字符串表示

            - 打印语句, 在打印对象名的时候, 会自动调用该对的toString方法.

                public static String valueOf(Object obj) {
                    return (obj == null) ? "null" : obj.toString();
                }

            - Object类中的toString方法, 默认逻辑

                public String toString() {
                    return getClass().getName() + "@" + Integer.toHexString(hashCode());
                }

            注意: 打印对象名,如果没有看到地址值,说明这个类绝对重写过toString方法.

     */
    public static void main(String[] args) {

        Student stu = new Student("张三", 23);
        System.out.println(stu);

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        System.out.println(list);

    }
}

