package com.itheima.file.method;

import java.io.File;
import java.io.FileFilter;

public class FileMethodDemo3 {
    /*
        public File[] listFiles() : 获取当前文件夹下, 所有的文件和文件夹对象(不包含子级目录)
     */
    public static void main(String[] args) {

        File file = new File("day09-code\\aaa");

        // 获取所有的文件和文件夹的对象
        File[] files = file.listFiles();

        // 遍历数组, 获取每一个文件和文件夹对象
        for (File f : files) {
            // 需求: 打印出所有的.java文件
            if(f.isFile() && f.getName().endsWith(".java")){
                System.out.println(f);
            }
        }

    }

    private static void method2(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isFile() && f.getName().endsWith(".java");
            }
        });

        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void method1(File file) {
        // 获取所有的文件和文件夹的对象
        File[] files = file.listFiles();

        // 遍历数组, 获取每一个文件和文件夹对象
        for (File f : files) {
            // 需求: 打印出所有的.java文件
            if(f.isFile() && f.getName().endsWith(".java")){
                System.out.println(f);
            }
        }
    }
}
