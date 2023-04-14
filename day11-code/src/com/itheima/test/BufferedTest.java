package com.itheima.test;

import java.io.*;
import java.util.TreeSet;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        // 1. 创建输入流对象, 关联要读取的文件
        BufferedReader br = new BufferedReader(new FileReader("day11-code\\出师表.txt"));
        // 2. 创建TreeSet集合, 准备存储读取到的每一行字符串 (排序)
        TreeSet<String> ts = new TreeSet<>();
        // 3. 循环读取, 将读取到的内容存入TreeSet集合
        String line;
        while( (line = br.readLine()) != null){
            ts.add(line);
        }
        // 4. 关闭输入流
        br.close();
        // 5. 创建输出流对象, 关联要写出的文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11-code\\出师表.txt"));
        // 6. 遍历集合
        for (String s : ts) {
            // 7. 将集合中的数据写出到文件
            bw.write(s);
            bw.newLine();
        }
        // 8. 关闭输出流
        bw.close();
    }
}
