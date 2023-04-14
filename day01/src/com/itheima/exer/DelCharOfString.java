package com.itheima.exer;

import java.util.ArrayList;
import java.util.Scanner;

/*
描述
实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。
输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
数据范围：输入的字符串长度满足 1≤n≤20  ，保证输入的字符串中仅出现小写字母
输入描述：
字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。

输出描述：
删除字符串中出现次数最少的字符后的字符串。
 */
public class DelCharOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串（20位以内）：");
        String input=sc.next();
        //将字符串转化为字符型数组
        char[] arr=input.toCharArray();
        ArrayList<Character> input2=new ArrayList<>();
        //将字符型数组放进集合input2里，方便后续调用方法，删除目标元素
        for (int i = 0; i < arr.length; i++) {
            input2.add(arr[i]);
            System.out.print(input2.get(i));
        }
        //各位置的元素逐一对比，统计出现的次数，记录为count，将count依次存入新的集合index
        ArrayList<Integer> index=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            index.add(count);
        }
        //查看并遍历集合,次数统计无问题

        // 索引的集合转化为整型数组，并打印查看，无问题
        Integer[] index2=index.toArray(new Integer[index.size()]);
        int[] target=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            target[i]=index2[i];
            System.out.print(target[i]);
        }
        System.out.println();
        //遍历index，找出最小值
        int min=target[0];
        for (int i = 0; i < target.length; i++) {
            if(min>target[i]){
                min=target[i];
            }
        }
        System.out.println(min);
        //创建新的集合，依次存入最小值的所在的索引
        ArrayList<Integer> target2=new ArrayList<>();

        for (int i = 0; i < target.length; i++) {
            if(target[i]==min){
                target2.add(i);
            }
        }
        //查看target2有无问题
        for (int i = 0; i < target2.size(); i++) {
            System.out.print(target2.get(i));
        }
        System.out.println();


       for (int i = 0; i < target2.size(); i++) {
           int num=target2.get(i);
            input2.remove(num);
       }


        //将删除后的字符型集合input2输出为字符串。
        String newStr="";
        for (int i = 0; i < input2.size(); i++) {
            newStr+=input2.get(i);
        }
        System.out.println(newStr);



    }

}
