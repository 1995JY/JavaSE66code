package com.itheima.map;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapTest3 {
    /*
        江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
        湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
     */
    public static void main(String[] args) {

        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        TreeSet<String> ts3 = new TreeSet<>();

        Collections.addAll(ts1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(ts2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(ts3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        TreeMap<String, TreeSet<String>> tm = new TreeMap<>();

        tm.put("江苏省", ts1);
        tm.put("湖北省", ts2);
        tm.put("河北省", ts3);

        tm.forEach(new BiConsumer<String, TreeSet<String>>() {
            @Override
            public void accept(String key, TreeSet<String> value) {
                // 打印省份(键)
                System.out.println(key);
                // 打印市(值)
                value.forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println("\t" + s);
                    }
                });
                System.out.println("----------------------------");
            }
        });

    }
}
