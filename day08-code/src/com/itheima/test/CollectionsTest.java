package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
    /*
        需求: 创建一个ArrayList集合, 内部存储 222 111 555 444 333整数
                - 对集合进行排序, 降序排列

        ------------------------------------------------------------

        积累思路:
                只要涉及集合的排序操作, 有两个可选方案
                        1. TreeSet
                        2. Collections.sort()

                                - 集合中存储的类型 :

                                        Java已经写好类 (String, Integer, Double...) : 具有自然排序规则
                                                                              - 如果自己想指定排序规则, 就可以传入比较器

                                        自己编写的类 (Student, Phone, User, Goods) :

                                                                方案1: 让自己的类, 实现Comparable接口, 具有自然排序
                                                                方案2: 在sort方法的第二个参数, 指定比较器

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 222, 111, 555, 444, 333);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list);

    }
}

