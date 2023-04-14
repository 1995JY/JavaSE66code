package com.itheima.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/*
ArrayList有以下元素: "a","f","b","c","a","d"利用TreeSet对ArrayList集合去重且排序

(最终结果: ArrayList中没有重复元素)
 */
public class test01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);
        TreeSet<String> ts=new TreeSet<>();
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            ts.add(it.next());
        }
        list.removeAll(list);
        System.out.println(list);
        for (String t : ts) {
            list.add(t);
        }
        System.out.println(list);
    }
}
