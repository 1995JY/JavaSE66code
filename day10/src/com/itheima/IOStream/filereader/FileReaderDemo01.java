package com.itheima.IOStream.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("day10\\a.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
