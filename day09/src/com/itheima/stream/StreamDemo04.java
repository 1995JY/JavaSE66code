package com.itheima.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        Stream<String> s1 = list.stream().limit(5);
        Stream<String> s2 = list.stream().skip(2);
        Stream.concat(s1,s2).filter( s -> s.length()==2).distinct().forEach(s -> System.out.println(s));
    }
}
