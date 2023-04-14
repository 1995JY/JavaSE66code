package com.itheima.buffered;

import java.io.*;

public class BufferedDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader( new FileReader("E:\\IO流操作\\2023.04.02-homework\\tlbb.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\copy.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
