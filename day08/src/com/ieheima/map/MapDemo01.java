package com.ieheima.map;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Integer i1=map.put("张三",23);
        Integer i2=map.put("李四",24);
        Integer i3=map.put("王五",25);
        Integer i4=map.put("王五",28);

        System.out.println(map);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
