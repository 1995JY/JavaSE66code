package com.itheima.file.method;

import com.itheima.file.FileDemo02;

import java.io.File;

public class FileMethodDemo02 {
    public static void main(String[] args) {
        File file= FileDemo02.getDir();
        printJavaFile(file);
    }

    private static void printJavaFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".java")){
                System.out.println(f);
            }else if(f.isDirectory()){
                if(f.listFiles()!=null){
                    printJavaFile(f);
                }
            }
        }
    }
}
