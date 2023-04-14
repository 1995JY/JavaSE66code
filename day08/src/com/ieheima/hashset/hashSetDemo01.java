package com.ieheima.hashset;

import com.itheima.domain.Student;

import java.util.HashSet;

public class hashSetDemo01 {
    public static void main(String[] args) {
        HashSet<Student> hash=new HashSet<>();
        hash.add(new Student("张三",23));
        hash.add(new Student("李四",24));
        hash.add(new Student("王五",25));
        hash.add(new Student("张三",27));
        hash.add(new Student("张三",23));
        System.out.println(hash);
    }
}
