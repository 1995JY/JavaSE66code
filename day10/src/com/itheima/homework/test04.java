package com.itheima.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
需求：
从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字  将学生信息保存到F盘下面的stu.txt文件中，
一个学生信息占据一行数据。当用户输入end时停止输入。
存储信息效果 :
heima001-张三
heima002-李四
heima003-王五
 */
public class test04 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("E:\\IO流操作\\2023.04.02-homework\\stu.txt");
        while (true) {
            String str=null;
            System.out.println("请输入学生学号：");
            String str1=sc.nextLine();
            if("end".equals(str1)){
                break;
            }else{
                str+=str1;
            }
            str+="-";
            System.out.println("请输入学生姓名：");
            String str2=sc.nextLine();
            if("end".equals(str2)){
                break;
            }else{
                str+=str2;
            }
            str+="\r\n";
            fos.write(str.getBytes());
        }
        fos.close();

    }
}
