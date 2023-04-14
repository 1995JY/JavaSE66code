package com.itheima.set.hashset;

import com.itheima.domain.Student;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        hs.add(new Student("张三", 23));
        hs.add(new Student("张三", 23));
        hs.add(new Student("张三", 23));
        hs.add(new Student("张三", 23));

        System.out.println(hs);
    }
}
