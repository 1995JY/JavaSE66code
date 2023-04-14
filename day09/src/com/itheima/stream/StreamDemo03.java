package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;


public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","谢广坤","张亮","张飞"));
        list1.stream().filter( s -> s.startsWith("张")).filter( s -> s.length()==3).forEach(s -> System.out.println(s));
        System.out.println(list1);

    }
}
