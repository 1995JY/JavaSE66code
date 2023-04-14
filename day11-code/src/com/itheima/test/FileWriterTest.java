package com.itheima.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    /*
        使用字符流, 完成文件拷贝
            - 只能拷贝纯文本文件
            - 建议: 如果你的需求只是拷贝文件, 一定要使用字节流

     */
    public static void main(String[] args) {

        try
                (FileReader fr = new FileReader("D:\\win.png");
                 FileWriter fw = new FileWriter("E:\\win.png");) {
            char[] chs = new char[1024];

            int len;

            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
