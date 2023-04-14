package com.itheima.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {
    /*
        需求: 拷贝文件

        分析:
                1. 创建字节输入流, 关流要拷贝的文件 (读取)
                2. 创建字节输出流, 关流要拷贝的目的地 (写出)
                3. 读写操作
                4. 关流
     */
    public static void main(String[] args) {

        try
                ( // 1. 创建字节输入流, 关流要拷贝的文件 (读取)
                  FileInputStream fis = new FileInputStream("D:\\A.flv");
                  // 2. 创建字节输出流, 关流要拷贝的目的地 (写出)
                  FileOutputStream fos = new FileOutputStream("E:\\A.flv");) {

            // 3. 读写操作
            byte[] bys = new byte[1024];

            int len;
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
