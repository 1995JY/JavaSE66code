package com.itheima.homework;

import java.util.Scanner;

/*
需求 :  键盘录入字符串 "10 20 50 30 40"

* 请将字符串中的数字,  降序排列  "50 40 30 20 10"
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符;");
        String str=sc.nextLine();
        System.out.println(str);
        String[] Arr1=str.split(" ");

        int[] Arr2=new int[Arr1.length];
        for (int i = 0; i < Arr1.length; i++) {
            Arr2[i]= Integer.parseInt(Arr1[i]);
        }
        for (int i = 0; i < Arr2.length-1; i++) {
            for(int j=0;j< Arr2.length-1-i;j++){
                if(Arr2[j]<Arr2[j+1]){
                    int temp=Arr2[j];
                    Arr2[j]=Arr2[j+1];
                    Arr2[j+1]=temp;
                }
            }
        }
        String str2="";
        for (int i = 0; i < Arr2.length; i++) {
            str2=str2+Arr2[i]+" ";
        }
        System.out.println(str2);

    }
}
