package com.itheima.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo5 {
    /*
        Stream流的收集操作 : 将流中的数据, 收集到集合中进行使用.

                思路:
                        调用collect();

                        方法中指定收集的集合类型

                                Collectors.toList()
                                Collectors.toSet()
                                Collectors.toMap()

                                           Collectors.toMap(确定键, 确定值);

                                                第一个泛型: 原始类型 : 流中的数据类型
                                                第二个泛型: 目标类型 : Map集合中, 键要存储的类型
                                                new Function<String, Object>(){

                                                }


                List<Integer> newList = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());


     */


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        // 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
        Map<String, Integer> map = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String[] sArr = s.split(",");
                int age = Integer.parseInt(sArr[1]);
                return age >= 24;
            }
        }).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split(",")[1]);
            }
        }));

        System.out.println(map);

    }
}
