package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    /*
        List集合

            - List集合中的特有方法, 都跟索引有关系
            - List集合因为有索引, 多了一种遍历方式, 可以使用普通for循环进行遍历

            1. 迭代器
            2. 增强for
            3. foreach
            4. 普通for循环
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(111);
        list.add(222);
        list.add(333);

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            System.out.println(num);
        }

        System.out.println("-------------------------");

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------");

        for (Integer num : list) {
            System.out.println(num);
        }

        System.out.println("-------------------------");

        list.forEach(num -> System.out.println(num));
    }
}
