package com.itheima.IOStream.Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream f =new FileInputStream("day10\\b.txt");
        int i=0;
        while((i=f.read())!=-1){
            System.out.println((char)(f.read()));
        }
    }
}
