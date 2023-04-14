package com.itheima.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        PrintStream ps=new PrintStream("day11\\PrintTest.txt");
        while (true) {
            System.out.println("请输入（886结束）：");
            String str=sc.nextLine();
            if("886".equals(str)){
                ps.close();
                break;
            }
            ps.println(str);
        }

    }
}
