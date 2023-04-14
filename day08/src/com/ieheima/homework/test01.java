package com.ieheima.homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

/*
需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量

* 如用户输入字符串:"helloworld java",程序输出结果：
* h(1)e(1)l(3)o(2)w(1)r(1)d(1) (1)j(1)a(2)v(1)
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str=new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : chars) {
            if(!(map.containsKey(c))){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        StringBuilder sb=new StringBuilder();
        map.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                sb.append(character).append("(").append(integer).append(")");
            }
        });
        String str2= sb.toString();
        System.out.println(str2);

    }
}
