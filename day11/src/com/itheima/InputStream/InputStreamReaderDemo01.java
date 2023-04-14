package com.itheima.InputStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\IO流操作\\2023.04.02-homework\\tlbb.txt"),"GBK"));
        System.out.println(br.readLine());
        br.close();
    }
}
