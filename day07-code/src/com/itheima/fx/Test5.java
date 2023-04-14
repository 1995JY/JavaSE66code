package com.itheima.fx;

import com.itheima.domain.Person;
import com.itheima.domain.Student;

import java.util.ArrayList;

public class Test5 {
    /*
        泛型通配符: ?

        ? super E : 可以传入的是E类型, 还有它的父类.
        ? extends E : 可以传入E的类型, 还有它的子类
     */
    public static void main(String[] args) {

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三",23));
        list1.add(new Person("李四",24));

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("王五", 25));
        list2.add(new Student("赵六", 26));

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("abc");
        list3.add("def");

        print(list1);
        print(list2);

    }

    public static void print(ArrayList<? extends Person> list){
        System.out.println(list);
    }
}


