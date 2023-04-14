package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    /*
        需求：按照下面的要求完成集合的创建和遍历

            * 创建一个集合，存储多个字符串元素
            * 把集合中所有以 "张" 开头的元素存储到一个新的集合
            * 把 "张" 开头的集合中的长度为 3 的元素存储到一个新的集合
            * 遍历上一步得到的集合
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));

        // Stream流可以简化集合的操作
        // 1. Stream流如何获取
        // 2. Stream流有哪些操作
        // 3. Stream流使用的时候需要注意哪些
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));

        // 把集合中所有以 "张" 开头的元素存储到一个新的集合
        ArrayList<String> list1 = new ArrayList<>();

        for (String s : list) {
            if(s.startsWith("张")){
                list1.add(s);
            }
        }

        // 把 "张" 开头的集合中的长度为 3 的元素存储到一个新的集合
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length() == 3){
                list2.add(s);
            }
        }

        // 遍历上一步得到的集合
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
