package com.itheima.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;

/*
字符流拷贝纯文本文件
 */
public class Test01 {
    public static void main(String[] args) {
        try
                (FileReader fr = new FileReader("E:\\IO流操作\\2023.04.02-homework\\tlbb.txt");
                 FileWriter fw = new FileWriter("E:\\IO流操作\\2023.04.02-homework\\tlbbCharCopy.txt");) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
