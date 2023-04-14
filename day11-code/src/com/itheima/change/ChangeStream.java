package com.itheima.change;

import java.io.*;

public class ChangeStream {
    /*
        转换流的作用 :

            1. 将字节流转换为字符流进行使用 (延后理解)
                    - 问题: 为什么不直接创建字符流使用呢?
                    - 回答: 今后有些流对象, 不是我们自己创建, 而是通过方法获取到的
                                - 返回的是字节流, 而我想要按照字符流思想去使用, 就需要用到转换流了

            2. 可以按照指定的编码表, 进行读写操作
                    - 场景: 我要读取一个文件, 这个文件的编码表是 GBK 码表
                            - 而平台默认读取方式, 是按照UTF-8的形式去读取
                            - 为了避免乱码问题, 就需要让程序按照GBK码表进行读取

        转换流的分类 :

             1. 输入流 : 按照指定码表读取

                    InputStreamReader

             2. 输出流 : 按照指定码表写出

                    OutputStreamWriter
     */
    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\a.txt", true), "gbk");

        osw.write("你好");

        osw.close();

    }

    private static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\a.txt"),"gbk"));

        System.out.println(br.readLine());

        br.close();
    }
}
