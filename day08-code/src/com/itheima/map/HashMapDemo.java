package com.itheima.map;

import java.util.LinkedHashMap;

public class HashMapDemo {
    /*
        实际上我们使用的单列集合, 底层都是依赖于双列集合

            HashSet ---> HashMap
            LinkedHashSet ---> LinkedHashMap
            TreeSet ---> TreeMap

            底层的数据结构都是一样, 只不过这些数据结构, 只针对于双列集合的键有效, 跟值没有关系的

            1. 创建集合
            2. 集合中的常用成员方法
            3. 集合的遍历操作
     */
    public static void main(String[] args) {

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("b", "北京");
        hm.put("a", "上海");
        hm.put("c", "广州");

        System.out.println(hm);

    }
}
