package com.itheima.file.method;

import java.io.File;
import java.io.FileFilter;

public class FileMethodDemo01 {
    public static void main(String[] args) {
        File file=new File("E:\\360\\day-07\\src\\com\\itheima");
        System.out.println(file);
        findJavaFile(file);
        File[] files = file.listFiles(f -> f.isFile() && f.getName().endsWith(".java"));
        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void findJavaFile(File file) {
        File[] files= file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".java")){
                System.out.println(f);
            }
        }
    }
}
