package com.itheima.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts1 =new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        ts1.add("aaaaaaaa");
        ts1.add("aaaaaaa");
        ts1.add("aaaaa");
        ts1.add("aaaa");
        ts1.add("aaa");
        ts1.add("a");
        System.out.println(ts1);

        TreeSet<Integer> ts2 =new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        ts2.add(111);
        ts2.add(888);
        ts2.add(555);
        ts2.add(777);
        ts2.add(333);
        System.out.println(ts2);

    }
}
