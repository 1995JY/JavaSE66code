package com.itheima.stream.bufferd;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1. 创建缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.flv"));
        // 2. 创建缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy1.flv"));

        int i = bis.read();
        System.out.println(i);

        bos.write(i);


        System.out.println("----------------");



    }
}
