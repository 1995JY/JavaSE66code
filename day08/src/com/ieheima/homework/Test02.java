package com.ieheima.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;

/*
定义一个Map集合，键用表示省份名称，值表示市，但是市会有多个。
添加完毕后，遍历结果：
格式如下：
江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
提示：
创建一个Map集合
键：类型为String，存省份名字。
值：类型为ArrayList，存多个市的名字。
 */
public class Test02 {
    public static void main(String[] args) {
        TreeSet<String> st1=new TreeSet<>();
        TreeSet<String> st2=new TreeSet<>();
        TreeSet<String> st3=new TreeSet<>();
        HashMap<String,TreeSet<String>> map=new HashMap<>();
        Collections.addAll(st1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(st2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(st3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        map.put("江苏省",st1);
        map.put("湖北省",st2);
        map.put("河北省",st3);
        map.forEach(new BiConsumer<String, TreeSet<String>>() {
            @Override
            public void accept(String s, TreeSet<String> strings) {
                System.out.println(s+"------"+strings);
            }
        });

    }
}
