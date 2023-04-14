package com.itheima.treeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        char[] arr=str.toCharArray();
        TreeSet<Character> list=new TreeSet<>();
        for (char c : arr) {
            list.add(c);
        }
        System.out.println(list);
    }
}
