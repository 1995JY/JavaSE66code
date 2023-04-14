package com.itheima.buffered;

import java.io.*;

public class BufferedStream {
    /*
        使用字符缓冲流拷贝纯文本文件

                BufferedReader

                    - 特有方法:  public String readLine() 一次读取一整行字符串
                                                     - 如果读取到了文件末尾(没有数据了), 返回null的结束标记

                BufferedWriter

                    - 特有方法:  public void newLine() : 写出换行符, 这个方法具有跨平台性
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("day11-code\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11-code\\b.txt", true));

        String line;

        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

    }

    private static void method() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day11-code\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11-code\\b.txt"));

        char[] chs = new char[1024];

        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs, 0, len);
        }

        br.close();
        bw.close();
    }
}
