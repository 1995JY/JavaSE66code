package com.itheima.IOStream.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("day10\\a.txt");
        char[] chs=new char[1024];
        int len;
        while((len=fr.read(chs))!=-1){
            String s=new String(chs,0,len);
            System.out.print(s);
        }
        String s="asda"+"\n"+"asjfbjaf";
        System.out.println(s);

    }
}
