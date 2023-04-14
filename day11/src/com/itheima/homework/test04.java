package com.itheima.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
定义一个字符缓冲输入流BufferedReader对象，读取”test2.txt”文件，一次读取一行，
将每行数据封装为一个Student对象，并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。
 */
public class test04 {
    public static void main(String[] args) throws IOException {
        List<Student> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("day11\\src\\com\\itheima\\homework\\test02.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] str=line.split(",");
            list.add(new Student(str[0],str[1],Integer.parseInt(str[2]),Double.parseDouble(str[3])));
        }
        br.close();
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
