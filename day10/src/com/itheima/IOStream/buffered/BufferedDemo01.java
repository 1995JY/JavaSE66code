package com.itheima.IOStream.buffered;

import java.io.*;
/*
字符缓冲流：141364毫秒
 */
public class BufferedDemo01 {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:\\迅雷下载\\heros\\movie\\a.mp4"));
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("D:\\copy.mp4"));
        int i;
        while((i=bis.read())!=-1){
            bos.write(i);
        }
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
