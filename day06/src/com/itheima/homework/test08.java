package com.itheima.homework;

import java.util.ArrayList;

/*
需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重

* 不允许使用 Set 集合 (因为是明天学的东西)
 */
public class test08 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);
        int q=0;

        for (int i = list.size()-1; i > 0; i--) {

            for (int j = 0; j < list.size()-1-q; j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                }
            }
            q++;
        }
        System.out.println(list);

    }
}
