package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    /*
        集合存储自定义对象
     */
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));

        // 依赖于对象的equals方法
        System.out.println(c.contains(new Student("李四", 24)));

        // 依赖于对象的equals方法
        c.remove(new Student("李四", 24));


        System.out.println(c);
    }
}
