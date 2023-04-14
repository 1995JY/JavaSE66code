package com.itheima.map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
    public static void main(String[] args) {
        TreeMap<Student, String> hm = new TreeMap<>();

        hm.put(new Student("李四", 24), "上海");
        hm.put(new Student("张三", 23), "北京");
        hm.put(new Student("王五", 25), "广州");
        hm.put(new Student("王五", 25), "成都");

        for (Map.Entry<Student, String> en : hm.entrySet()) {
            System.out.println(en.getKey() + "---" + en.getValue());
        }
    }
}
