package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    /*
        FileOutputStream  字节输出流写出数据

        问题1: 如果想要实现追加写入, 怎么办?

                public FileOutputStream(String name) : 字节输出关联文件, 没有开启追加写入
                public FileOutputStream(String name, boolean append) :
                                                        字节输出关联文件, 第二个参数是追加写入的开关

        问题2: 写出数据的时候, 想要带有换行效果, 怎么办?

                写出回车换行符

                    windows : \r\n
                    mac : \r
                    linux : \n

     */
    public static void main(String[] args) throws IOException {

        // 1. 创建字节输出流对象, 关联文件
        // (文件如果不存在, 则自动创建)
        // (文件如果存在: 会清空原有内容, 再重新写入)
        FileOutputStream fos = new FileOutputStream("day10-code\\a.txt", true);

        // 2. 调用write方法写出数据 (只能写出字节)
        fos.write("地振高冈一派西山千古秀".getBytes());
        fos.write("\r\n".getBytes());


        // 3. 关闭流释放资源
        fos.close();

    }
}

