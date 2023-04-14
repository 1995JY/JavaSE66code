package com.itheima.treeSet;

import com.itheima.domain.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeTestDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> list=new TreeSet<>();
        list.add(new Student("张三",23));
        list.add(new Student("王五",25));
        list.add(new Student("李四",24));
        list.add(new Student("西门吹雪",24));
        list.add(new Student("赵六",26));
        list.add(new Student("李四",24));
        System.out.println(list);

        TreeSet<Student> list4=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return 0;
            }
        });
        list4.add(new Student("张三",23));
        list4.add(new Student("王五",25));
        list4.add(new Student("李四",24));
        list4.add(new Student("西门吹雪",24));
        list4.add(new Student("赵六",26));
        list4.add(new Student("李四",24));

        TreeSet<String> list2=new TreeSet<>();
        list2.add("a");
        list2.add("j");
        list2.add("d");
        list2.add("b");
        list2.add("q");
        System.out.println(list2);

        TreeSet<Integer> list3=new TreeSet<>();
        list3.add(2);
        list3.add(6);
        list3.add(8);
        list3.add(1);
        list3.add(28);
        list3.add(7);
        System.out.println(list3);


    }

}

