package com.itheima.file.method;

import java.io.File;

public class FileMethodDemo1 {
    public static void main(String[] args) {
        File f1 = new File("day09-code\\A.txt");
        // 判读是否是文件夹
        System.out.println(f1.isDirectory());
        // 判读是否是文件
        System.out.println(f1.isFile());
        // 判读是否存在
        System.out.println(f1.exists());
        // length() : 如果操作文件, 返回字节个数, 如果是文件夹, 返回错误的字节个数
        System.out.println(f1.length());
        // 获取绝对路径
        System.out.println(f1.getAbsolutePath());
        // 获取文件,文件夹名
        System.out.println(f1.getName());

    }
}
