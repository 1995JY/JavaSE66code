package com.itheima.set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
        Set集合的特点 : 存取无序, 没有索引, 不可以存储重复的

        - TreeSet集合 : 对集合中的数据进行排序

            String字符串: 根据编码表中的数值进行排序操作
     */
    public static void main(String[] args) {

        // 需求: 键盘录入一个字符串, 对字符串进行排序和去重操作
        System.out.println("请输入一个字符串: ");
        String content = new Scanner(System.in).nextLine();

        // 1. 将字符串拆分为字符数组
        char[] chars = content.toCharArray();

        // 2. 将每一个字符存入TreeSet集合
        TreeSet<Character> ts = new TreeSet<>();

        // 3. 遍历字符数组
        for (char c : chars) {
            ts.add(c);
        }

        System.out.println(ts);


    }
}
