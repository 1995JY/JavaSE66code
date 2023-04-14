package com.itheima.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    /*
        ConcurrentModificationException 并发修改异常(撞车了) :

                迭代器遍历集合的时候, 使用集合对象, 调用添加或删除,修改的方法, 操作集合中的元素, 就会出现并发修改异常

                        (迭代器, 集合对象) 在并发操作

                解决方案:

                        迭代器在遍历的时候, 使用迭代器自己的删除方法

        -------------------------------------------------------------------------------------

        细节 : 如果使用集合对象, 删除的是倒数第二个元素, 就不会出现并发修改异常
        结论 : 逃过了编译器的异常检查
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("ccc");
        list.add("bbb");
        list.add("def");
        list.add("123");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String s = it.next();
            if("def".equals(s)){
                list.remove("def");
            }
        }

        System.out.println(list);


    }
}
