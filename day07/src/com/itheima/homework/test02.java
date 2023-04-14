package com.itheima.homework;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r =new Random();
        //随机生成的6个红色中奖号码
        TreeSet<Integer> ts1=new TreeSet<>((o1, o2) -> o1-o2);
        for (int i = 0; i < 6; i++) {
            if(ts1.add(r.nextInt(33)+1)){
                continue;
            }else{
                i--;
            }
        }
        //随机生成的1个蓝色中奖号码
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(r.nextInt(16)+1);
        //用户键入6个红色号码
        TreeSet<Integer> ts3=new TreeSet<>((o1, o2) -> o1-o2);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int num=0;
            try {
                 num=Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("数据格式输入有误，请重新输入：");
                i--;
                continue;
            }
            if(num<1||num>33){
                System.out.println("数据范围输入有误，请在1-33之间选择，并重新输入：");
                i--;
                continue;
            }
            if(!(ts3.add(num))){
                System.out.println("输入的号码有重复，请重新输入");
                i--;
            }
        }

        //用户键入1个蓝色号码
        TreeSet<Integer> ts4=new TreeSet<>();

        while(true){
            System.out.println("请输入1个篮球号码：");
            try {
                int num=Integer.parseInt(sc.nextLine());
                if(num>0&&num<=16){
                    ts4.add(num);
                    break;
                }else{
                    System.out.println("数据输入有误，请选择范围1-16，并重新输入：");
                }
            } catch (NumberFormatException e) {
                System.out.println("数据输入格式有误，请重新输入：");
            }
        }
        //将自动生成和红色随机键入的号码，全部放入一个新的集合
        TreeSet<Integer> ts5=new TreeSet<>((o1, o2) -> o1-o2);
        ts5.addAll(ts1);
        ts5.addAll(ts3);
        //将自动生成和随机键入的蓝色号码，全部放入一个新的集合
        TreeSet<Integer> ts6=new TreeSet<>();
        ts6.addAll(ts2);
        ts6.addAll(ts4);
        System.out.println("随机生成的红色号码为"+ts1);
        System.out.println("随机生成的蓝色号码为"+ts2);

        System.out.println("红球中了："+(6-ts5.size()+ts1.size())+"个，蓝球中了："+(1-ts6.size()+ts2.size())+"个");

    }
}

