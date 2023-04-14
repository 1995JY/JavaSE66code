package com.itheima.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
请使用字节流复制一个文件，一次读、写一个字节
 */
public class test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\IO流操作\\2023.04.02-homework\\tlbb.txt");
        FileOutputStream fos=new FileOutputStream("E:\\IO流操作\\2023.04.02-homework\\copy1.txt");
        int i;
        while((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}
