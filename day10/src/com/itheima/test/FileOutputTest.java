package com.itheima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("day10\\b.txt",true);
        while (true) {
            System.out.println("请输入您想要输入的写入的内容：");
            Scanner sc = new Scanner(System.in);
            String str= sc.nextLine();
            if ("886".equals(str)) {
                break;
            } else {
                f1.write(str.getBytes());
                f1.write("\r\n".getBytes());
            }
        }
        f1.close();

    }
}
