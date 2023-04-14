package com.itheima.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    /*
        情况: 集合中存储的元素, 是Java已经写好的类, 这些类中的排序规则, 我们没有办法改变(不能修改源码)

                - 我想改变它的排序规则, 怎么办 ?
                - 解决: 使用比较器进行排序.

        - 注意:
                如果同时具有自然排序, 和比较器排序, 会优先按照比较器指定的规则进行排序.

                    1. 类实现过Comparable接口 : 具有自然排序
                    2. TreeSet构造方法中, 传入Comparator接口的实现类对象 : 比较器排序


        - 结论:
                什么时候使用比较器排序, 需要覆盖自然排序的规则.
     */
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        ts.add("aaaaaaa");
        ts.add("aaaaaa");
        ts.add("aaaaa");
        ts.add("aaa");
        ts.add("a");

        // 需求: 按照字符串的长度, 从大到小进行排序
        System.out.println(ts);


        // 需求: 集合中添加元素111 333 555 444 222, 将集合中的元素, 降序排序.
        TreeSet<Integer> nums = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        nums.add(111);
        nums.add(333);
        nums.add(555);
        nums.add(444);
        nums.add(222);

        System.out.println(nums);

    }
}
