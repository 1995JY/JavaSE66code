package com.itheima.file.method;

import com.itheima.test.FileTest1;

import java.io.File;

public class FileMethodDemo4 {
    public static void main(String[] args) {
        // 1. 键盘录入一个文件夹路径
        File dir = FileTest1.getDir();
        // 2. 程序打印出该文件夹下所有的.java文件
        printJavaFile(dir);
    }

    public static void printJavaFile(File dir) {
        // 1. 获取该文件夹下所有的文件和文件夹的对象
        File[] files = dir.listFiles();
        // 2. 遍历数组, 获取每一个文件和文件夹对象
        for (File file : files) {
            // 3. 判断是否是文件
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file);
            } else if (file.isDirectory()) {
                // 4. 代码执行到这里, 说明file对象是一个文件夹.
                // 思路: 进入这个文件夹, 继续查找.java文件
                if(file.listFiles() != null){
                    printJavaFile(file);
                }
            }
        }
    }
}
