package com.itheima.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    /*
        细节: list.get(i) : 表面来看是根据索引获取元素

        但是这个集合是LinkedList, 底层是链表结构, 找元素的时候

                1. 判断你要查找的元素, 离头部近, 还是离尾部近
                2. 离头部近 : 从头开始查找(正序遍历)
                3. 离尾部近 : 从尾开始查找(倒序遍历)
     */

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");

        list.removeFirst();
        list.removeLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
