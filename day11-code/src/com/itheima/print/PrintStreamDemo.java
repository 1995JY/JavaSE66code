package com.itheima.print;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {

        // 了解: 改变打印语句所指向的位置
        System.setOut(new PrintStream("day11-code\\e.txt"));
        System.out.println("abc");
        System.out.println(123);
        System.out.println(false);

    }

    private static void show() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("day11-code\\d.txt", true), true);

        pw.println("abc");
    }

    private static void method() throws FileNotFoundException {
        PrintStream ps = new PrintStream("day11-code\\c.txt");

        ps.print(97);
        ps.println("abc");
        ps.println(12.3);
        ps.println(123);
        ps.println('a');
        ps.println(false);

        ps.close();
    }
}
