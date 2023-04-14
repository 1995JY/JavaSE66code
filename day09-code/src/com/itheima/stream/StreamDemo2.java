package com.itheima.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    /*
        获取Stream流 : 如何将手里的数据, 放在Stream流中(进入流水线)

        1. 单列集合数据到Stream流
                    - 集合对象.stream();
        2. 双列集合数据到Stream流
                    - Stream<String> s1 = hm.keySet().stream();  不推荐
                    - Stream<String> s2 = hm.values().stream();  不推荐
                            原因: 键和值分开存储了

                    - Stream<Map.Entry<String, String>> s1 = hm.entrySet().stream(); 推荐
                            原因: 键和值都在entry(键值对)对象中
        3. 数组数据到Stream流
                    - Arrays.stream(数组);
                    - 注意: 数组需要是引用数据类型
        4. 同种数据类型的多个值, 到Stream流
                    -

        ---------------------------------

        Stream流的终结方法 :

                foreach : 遍历
     */
    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("-----------------");

        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "北京");
        hm.put("李四", "上海");
        hm.put("王五", "广州");

        hm.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "---" + entry.getValue()));

        System.out.println("-----------------");

        Integer[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).forEach(s -> System.out.println(s));

        System.out.println("-----------------");

        Stream.of(1,2,3,4,5,6).forEach(s -> System.out.println(s));
    }
}
