package com.itheima.lambda;

import java.util.ArrayList;

public class Test {
    /*
        需求：按照下面的要求完成集合的创建和遍历

            * 创建一个集合，存储多个字符串元素
            * 把集合中所有以 "张" 开头的元素存储到一个新的集合
            * 把 "张" 开头的集合中的长度为 3 的元素存储到一个新的集合
            * 遍历上一步得到的集合
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        // 把集合中所有以 "张" 开头的元素存储到一个新的集合
        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.startsWith("张")){
                list1.add(s);
            }
        }

        // 把 "张" 开头的集合中的长度为 3 的元素存储到一个新的集合
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            if(s.length() == 3){
                list2.add(s);
            }
        }

        // 遍历上一步得到的集合
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
