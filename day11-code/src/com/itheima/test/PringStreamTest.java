package com.itheima.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PringStreamTest {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("day11-code\\f.txt");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入:");
            String msg = sc.nextLine();
            if("886".equals(msg)){
                ps.close();
                break;
            }
            ps.println(msg);
        }

    }
}
