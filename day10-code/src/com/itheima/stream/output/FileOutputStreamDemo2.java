package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    /*
        FileOutputStream写出数据的几种方式 :

            1. public void write(int b) : 写出一个字节
            2. public void write(byte[] b) : 写出一个字节数组
            3. public void write(byte[] b, int off, int len) : 写出字节数组的一部分
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("day10-code\\b.txt");

        byte[] bys = {97, 98, 99};

        fos.write(bys, 1, 2);

        fos.close();
    }
}
