package com.itheima.stream.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    /*
        FileInputStream 字节输入流读取数据

        线索: 调用read方法, 读取文件中的数据, 如果已经读取到了文件的末尾, 将会返回-1的标记
     */
    public static void main(String[] args) throws IOException {

        // 1. 创建字节输入流对象, 关流要读取的文件
        FileInputStream fis = new FileInputStream(new File("day10-code\\a.txt"));

        // 2. 读取数据
        int i;

        while( (i = fis.read()) != -1 ){
            System.out.println((char)i);
        }

        // 3. 关闭流释放资源
        fis.close();


    }
}
