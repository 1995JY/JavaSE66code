package com.itheima.IOStream.Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("day10\\b.txt");
        byte[] arr=new byte[3];
        int len;
        while((len=f.read(arr))!=-1){
            String s= new String(arr,0,len);
            System.out.print(s);
        }
    }
}
