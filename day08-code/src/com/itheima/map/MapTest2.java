package com.itheima.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTest2 {
    /*
        需求: 键盘录入一个字符串, 统计出每一个字符出现的次数 (键的位置要有顺序)

        思路: 设计一个Map集合
                (key:字符)(value:次数)

                拿到一个字符, 去集合中判断是否包含传入的键

                                包含 : 键的位置存字符, 值的位置 = 旧值 + 1 存回去
                                不包含 : 键的位置存储字符, 值的位置存储 1

        Map集合 :
                    HashMap : 元素唯一
                    LinkedHashMap : 元素唯一, 还要保证存取顺序
                    TreeMap  : 排序
     */
    public static void main(String[] args) {

        // 准备map集合, 用于统计操作
        TreeMap<Character, Integer> tm = new TreeMap<>();
        // 键盘录入字符串
        System.out.println("请输入: ");
        String content = new Scanner(System.in).nextLine();
        // 拆分字符串
        char[] chars = content.toCharArray();
        // 遍历字符数组
        for (char c : chars) {
            // 判断当前字符在集合中是否存在
            if (!tm.containsKey(c)) {
                // 不包含: 说明第一次出现
                tm.put(c, 1);
            } else {
                // 包含: 不是第一次出现, 获取原来的值, +1存回去
                tm.put(c, tm.get(c) + 1);
            }
        }

        // 创建一个字符串缓冲区(容器)
        StringBuilder sb = new StringBuilder();
        // 遍历集合, 获取键和值
        for(Map.Entry<Character, Integer> en : tm.entrySet()){
            // 拼接为指定的格式
            sb.append(en.getKey()).append("(").append(en.getValue()).append(")");
        }

        System.out.println(sb);

    }
}
