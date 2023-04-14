package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","谢广坤","张亮","张飞"));
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        for (String s : list1) {
            char[] chars = s.toCharArray();
            if('张'==chars[0]){
                list2.add(s);
            }
        }
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
