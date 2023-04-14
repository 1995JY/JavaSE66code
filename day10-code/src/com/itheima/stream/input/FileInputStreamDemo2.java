package com.itheima.stream.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
    /*
        FileInputStream 一次读取多个字节
     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("day10-code\\a.txt");

        byte[] bys = new byte[2];

        int len1 = fis.read(bys);
        System.out.println(len1);
        System.out.println(Arrays.toString(bys));

        int len2 = fis.read(bys);
        System.out.println(len2);
        System.out.println(Arrays.toString(bys));

        int len3 = fis.read(bys);
        System.out.println(len3);
        System.out.println(Arrays.toString(bys));

        int len4 = fis.read(bys);
        System.out.println(len4);
        System.out.println(Arrays.toString(bys));

        fis.close();


    }
}
