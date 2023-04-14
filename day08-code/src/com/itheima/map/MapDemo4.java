package com.itheima.map;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "北京");
        hm.put("李四", "上海");
        hm.put("王五", "广州");

        hm.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "---" + value);
            }
        });

        hm.forEach((k, v) -> System.out.println(k + "---" + v));
    }
}
