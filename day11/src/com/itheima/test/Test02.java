package com.itheima.test;

import java.io.*;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("day11\\出师表.txt"));
        TreeSet<String> ts =new TreeSet<>();
        String line;
        while((line=br.readLine())!=null){
            ts.add(line);
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("day11\\出师表.txt"));
        for (String t : ts) {
            bw.write(t);
            bw.newLine();
        }
        bw.close();
    }
}
