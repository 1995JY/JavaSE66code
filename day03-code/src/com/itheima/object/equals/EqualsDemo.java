package com.itheima.object.equals;

import com.itheima.domain.Student;

public class EqualsDemo {
    /*
        Object类的equals方法 :

                public boolean equals(Object obj) : 让对象之间做比较, 返回true, false

                public boolean equals(Object obj) {
                    // this : stu1
                    // obj : stu2
                    // Object类的equals方法, 默认也是让对象之间比较地址值
                    return (this == obj);
                }

     */
    public static void main(String[] args) {

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);

        System.out.println(stu1.equals(stu2));

    }
}
