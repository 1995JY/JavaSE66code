package com.itheima.file.method;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo2 {
    public static void main(String[] args) throws IOException {
        // 1. 创建文件
        File f1 = new File("day09-code\\B.txt");
        System.out.println(f1.createNewFile());

        // 2. 创建文件夹
        File f2 = new File("day09-code\\bbb");
        System.out.println(f2.mkdir());

        File f3 = new File("day09-code\\ccc");
        System.out.println(f3.mkdirs());

        // 3. 删除文件(不走回收站) 删除文件夹(只能删除空文件夹)
        System.out.println(f3.delete());
    }
}
