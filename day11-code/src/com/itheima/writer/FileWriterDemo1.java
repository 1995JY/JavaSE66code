package com.itheima.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    /*
        字符输出流写出数据

            flush : 将缓冲区(内置的小数组)的数据刷出到文件
                        - 刷出之后, 可以继续调用write方法写出数据
            close : 其主要功能是关闭流释放资源
                        - 关闭之前, 会检查缓冲区中是否还有数据, 有的话, 顺带进行刷出操作
     */
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("day11-code\\a.txt");

        fw.write("你好, 字符流");

        fw.close();



    }

    private static void method() throws IOException {
        FileWriter fw = new FileWriter("day11-code\\a.txt", true);

        char[] chs = {'b','c','d'};

        // 写出单个字符
        fw.write(97);
        // 写出一个字符数组
        fw.write(chs);
        // 写出字符数组的一部分
        fw.write(chs, 1, 1);
        // 写出一个字符串
        fw.write("你好你好");
        fw.write("\r\n");
        // 写出字符串的一部分
        fw.write("黑马程序员", 0, 2);

        fw.close();
    }
}
