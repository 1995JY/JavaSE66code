package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionIterator {
    /*
        集合的通用遍历方式 : 迭代器遍历

            1. 获取迭代器
                    Iterator<Student> it = c.iterator();
                    接口的引用 = 实现类的对象

            2. 循环判断集合中是否还有元素
                    while(it.hasNext())

            3. 调用next方法取出元素
                    System.out.println(it.next());

        -----------------------------------------------------------

        增强for循环 :

                JDK5版本之后出现的一种迭代器的语法糖
                        - 底层也是一个迭代器

                for(数据类型 变量名 : 要遍历的数组或集合){
                }

        -----------------------------------------------------------

        集合中的foreach方法

                 c.forEach(new Consumer<Student>() {
                    @Override
                    public void accept(Student stu) {
                        System.out.println(stu);
                    }
                });
     */
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));

        // 1. 获取迭代器
        Iterator<Student> it = c.iterator();

        // 2. 循环判断集合中是否还有元素
        while (it.hasNext()) {
            // 3. 调用next方法取出元素
            System.out.println(it.next());
        }

        System.out.println("--------------------------");

        for (Student stu : c) {
            System.out.println(stu);
        }

        System.out.println("--------------------------");

        c.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student stu) {
                System.out.println(stu);
            }
        });
    }

}
