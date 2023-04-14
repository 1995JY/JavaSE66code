package com.itheima.map;

import java.util.HashMap;

public class MapDemo1 {
    /*
        put 方法的细节 :  向集合中添加元素, 如果添加的元素(键, 已经存在了)
                                - 此时, 就不是添加了, 而是修改了.
                                - 返回值: 被覆盖掉的元素
     */
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("张三", 23);
        hm.put("李四", 24);
        hm.put("王五", 25);

        System.out.println(hm);
        System.out.println(hm.isEmpty());

        System.out.println(hm.containsKey("张三") + "---");
        System.out.println(hm.containsKey("赵六") + "---");

        System.out.println(hm.containsValue(1) + "!!!");


        System.out.println(hm.size());


    }

    private static void method() {
        HashMap<String, Integer> hm = new HashMap<>();

        Integer i1 = hm.put("张三", 23);
        Integer i2 = hm.put("李四", 24);
        Integer i3 = hm.put("王五", 25);
        Integer i4 = hm.put("王五", 28);

        System.out.println(hm);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
