package com.itheima.set;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    /*
        Collections.sort() : 可以对传入的集合进行排序(升序), 如果集合中存储的类型, 没有实现过Comparable接口, 将编译出错.
     */
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Collections.addAll(list, new Student("张三", 25), new Student("李四", 24));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        System.out.println(list);


    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>();

        // 批量添加
        Collections.addAll(list, "a", "b", "c", "c", "c");

        System.out.println(list);

        // 将集合中的元素(洗牌)
        Collections.shuffle(list);

        System.out.println(list);
    }
}
