package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("王五", 25));
        ts.add(new Student("张三", 23));
        ts.add(new Student("李四", 24));
        ts.add(new Student("赵六", 26));

        for (Student stu : ts) {
            System.out.println(stu);
        }


    }
}
