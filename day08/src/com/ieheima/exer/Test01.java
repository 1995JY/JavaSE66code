package com.ieheima.exer;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
输入一个字符串，判断各字符出现的次数并打印
格式如下：

dccbbbaaaaffffff

a(4)b(3)c(2)d(1)f(6)
 */
public class Test01 {
    public static void main(String[] args) {

        System.out.println("请输入一串字符串：");
        String str=new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        TreeMap<Character,Integer> map=new TreeMap<>();
        for (char c : chars) {
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
        StringBuilder sb=new StringBuilder();
        Set<Map .Entry<Character,Integer>> entries=map.entrySet();
        for(Map.Entry<Character,Integer> a:entries){
            sb.append(a.getKey()).append("(").append(a.getValue()).append(")");
        }
        System.out.println(sb);
    }
}
