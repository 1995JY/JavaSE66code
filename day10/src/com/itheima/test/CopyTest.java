package com.itheima.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
30817毫秒
32091
51
 */
public class CopyTest {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("F:\\pictures\\a.jpg");
        FileOutputStream fos=new FileOutputStream("F:\\copy.jpg");
        byte[] arr=new byte[1024];
        int len;
        while((len=fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        fis.close();
        fos.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
