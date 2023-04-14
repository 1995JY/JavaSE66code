package com.itheima.IOStream.Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream s1=new FileOutputStream("day10\\a.txt");
        s1.write("你好，java".getBytes());
        s1.close();
    }
}
