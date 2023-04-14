package com.itheima.mstatic;

public class StaticDemo {
    /*
        static关键字 : 是Java中的修饰符
                1. 成员变量 : 如果是共享数据, 就可以加入static
                2. 成员方法

        特点:
                1. 被类的所有对象所共享
                2. 多了一种调用方式, 可以通过类名调用 (推荐)
                3. 随着类的加载而加载, 优先于对象存在.
     */
    public static void main(String[] args) {

        Student.school = "传智专修学院";

        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        System.out.println(stu1.name + "---" + stu1.age + "---" + Student.school);

        System.out.println("-----------------");

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;
        Student.school = "黑马程序员";
        System.out.println(stu2.name + "---" + stu2.age + "---" + Student.school);

    }
}

class Student {
    String name;
    int age;
    static String school;
}
