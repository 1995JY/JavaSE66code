package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    /*
        TreeSet集合存储自定义对象, 要是没有指定排序方式, 就会出现错误.

            1. 让自己编写的类, 实现Comparable接口 (具有可比性)
            2. 重写compareTo
                    0  : Student{name = 张三, age = 23}
                    1  : 正序
                    -1 : 倒序

         细节: TreeSet集合底层的数据结构是红黑树.

     */
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("张三", 23));
        ts.add(new Student("王五", 25));
        ts.add(new Student("李四", 24));
        ts.add(new Student("李四", 24));

        System.out.println(ts);

    }
}
