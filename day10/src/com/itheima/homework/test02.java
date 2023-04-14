package com.itheima.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
请使用字节流复制一个文件，一次读、写一个1K (1024) 的字节数组
 */
public class test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\IO流操作\\2023.04.02-homework\\tlbb.txt");
        FileOutputStream fos=new FileOutputStream("E:\\IO流操作\\2023.04.02-homework\\copy2.txt");
        byte[] bts=new byte[1024];
        int len;
        while((len= fis.read(bts))!=-1){
            fos.write(bts,0,len);
        }
        fis.close();
        fos.close();
    }
}
