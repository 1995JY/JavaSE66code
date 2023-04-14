package com.itheima.test;

import java.io.File;

public class FileTest4 {
    /*
        length() : 获取文件的字节个数
            - 文件夹对象, 调用这个方法, 将会得到一个错误的值
     */
    public static void main(String[] args) {

        System.out.println(getLength(new File("D:\\Develop")));

    }

    public static long getLength(File dir) {

        long result = 0;

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                result += file.length();
            } else {
                // 文件夹: 进入文件夹, 继续统计字节个数
                if (file.listFiles() != null) {
                    result += getLength(file);
                }
            }
        }

        return result;

    }
}
