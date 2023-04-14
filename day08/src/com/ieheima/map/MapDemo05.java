package com.ieheima.map;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapDemo05 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Integer i1=map.put("张三",23);
        Integer i2=map.put("李四",24);
        Integer i3=map.put("王五",25);
        Integer i4=map.put("赵六",28);
        System.out.println(map);
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"---"+integer);
            }
        });
    }
}
