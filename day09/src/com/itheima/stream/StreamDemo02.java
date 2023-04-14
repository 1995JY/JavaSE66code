package com.itheima.stream;

import java.util.*;
import java.util.function.Consumer;

public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","谢广坤","张亮","张飞"));
        list1.stream().forEach(s -> System.out.println(s));
        System.out.println("------------");
        Set<String> set=new TreeSet<>();
        Collections.addAll(set,"张三丰","张无忌","张翠山","王二麻子","谢广坤","张亮","张飞");
        set.stream().forEach( s -> System.out.println(s));
        System.out.println("------------");
        Map<String,Integer> map=new HashMap<>();
        map.put("张三丰",100);
        map.put("张翠山",35);
        map.put("张无忌",18);
        map.put("王二麻子",28);
        map.put("张亮",55);
        map.put("谢广坤",43);
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"----"+entry.getValue()));
    }
}
