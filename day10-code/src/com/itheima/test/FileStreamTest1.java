package com.itheima.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest1 {
    /*
        需求: 从键盘录入字符串, 将用户输入的数据, 保存到当前模块下info.txt
                如果用户输入的内容是 886 程序结束
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos =
                new FileOutputStream("day10-code\\info.txt",
                        true);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入:");
            String info = sc.nextLine();

            if ("886".equals(info)) {
                fos.close();
                break;
            } else {
                // 将数据, 写出到文件
                fos.write(info.getBytes());
                fos.write("\r\n".getBytes());
            }
        }

    }
}
