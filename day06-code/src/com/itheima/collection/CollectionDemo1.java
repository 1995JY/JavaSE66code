package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 多态的形式创建对象, 调用内部共有的方法
        Collection<String> c = new ArrayList<>();

        c.add("张三");
        c.add("李四");
        c.add("王五");

        System.out.println(c);

        // 根据元素做删除
        boolean b = c.remove("李四");
        System.out.println(b);

        // 判断集合中是否包含传入的元素
        System.out.println(c.contains("张三"));
        System.out.println(c.contains("李四"));

        // 判断集合是否为空
        System.out.println(c.isEmpty());

        // 获取集合长度
        System.out.println(c.size());
    }
}
