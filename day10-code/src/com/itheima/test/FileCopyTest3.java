package com.itheima.test;

import java.io.*;

public class FileCopyTest3 {
    /*
        四种拷贝方式 :

            1. 普通流单个字节拷贝
            2. 普通流 + 自定义数组拷贝   :  144毫秒
            3. 缓冲流单个字节拷贝        :  3209毫秒
            4. 缓冲流 + 自定义数组拷贝   :  146毫秒
     */
    public static void main(String[] args) throws IOException {


        long start = System.currentTimeMillis();

        method2();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

    private static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\A.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy4.exe"));

        byte[] bys = new byte[1024];

        int len;

        while((len = bis.read(bys)) != -1){
            bos.write(bys, 0, len);
        }

        bis.close();
        bos.close();
    }

    private static void method3() throws IOException {
        // 3. 缓冲流单个字节拷贝
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\A.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy3.exe"));

        int i;

        while((i = bis.read()) != -1){
            bos.write(i);
        }

        bis.close();
        bos.close();
    }

    private static void method2() throws IOException {
        // 2. 普通流 + 自定义数组拷贝
        FileInputStream fis = new FileInputStream("D:\\A.exe");
        FileOutputStream fos = new FileOutputStream("E:\\copy2.exe");

        byte[] bys = new byte[8192];

        int len;

        while((len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }

    private static void method1() throws IOException {
        // 1. 普通流单个字节拷贝
        FileInputStream fis = new FileInputStream("D:\\A.exe");
        FileOutputStream fos = new FileOutputStream("E:\\copy1.exe");

        int i;
        while((i = fis.read()) != -1){
            fos.write(i);
        }

        fis.close();
        fos.close();
    }
}
