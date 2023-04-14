package com.itheima.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    /*
        Stream流对象的注意事项: 当你的流, 被操作过, 就不能再次使用了
                - 流水线不允许回头.
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        // 需求1：取前4个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);
        // 需求2：跳过2个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);
        // 需求3：合并需求1和需求2得到的流，并把结果在控制台输出
        // Stream.concat(s1,s2).forEach(s -> System.out.println(s));
        // 需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        System.out.println(Stream.concat(s1, s2).distinct().count());
    }

    private static void method(ArrayList<String> list) {
        //需求1：取前3个数据在控制台输出
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
        //需求2：跳过3个元素，把剩下的元素在控制台输出
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
        //需求3：跳过2个元素，把剩下的元素中前2个在控制台输出
        list.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
    }
}
