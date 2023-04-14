package com.itheima.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    /*
        字符流一次读取多个字符
     */
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("day10-code\\c.txt");

        char[] chs = new char[1024];

        int len;

        while ((len = fr.read(chs)) != -1) {

            System.out.println(new String(chs, 0, len));

        }

        fr.close();

    }
}
