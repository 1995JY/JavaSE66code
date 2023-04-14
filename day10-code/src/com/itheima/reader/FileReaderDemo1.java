package com.itheima.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    /*
        字符流的使用场景: 读取纯文本文件, 解决中文乱码问题

        字符流解决中文乱码的原理 :

                字符流底层 = 字节流 + 编码表
     */
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("day10-code\\b.txt");

        int i;

        while ((i = fr.read()) != -1) {
            System.out.println((char)i);
        }

        fr.close();


    }

    private static void method() throws IOException {
        // 字节流读取纯文本文件, 出现的中文乱码问题
        FileInputStream fis = new FileInputStream("day10-code\\b.txt");

        int i;

        byte[] bys = new byte[3];

        while ((i = fis.read(bys)) != -1) {
            String s = new String(bys);
            System.out.println(s);
        }

        fis.close();
    }
}
