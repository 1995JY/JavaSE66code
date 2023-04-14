package com.itheima.file.method;

import com.itheima.file.FileDemo02;

import java.io.File;

public class exer03 {
    public static void main(String[] args) {
        File file = FileDemo02.getDir();
        DeleteDir(file);
    }

    private static void DeleteDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                if (f.listFiles() != null) {
                    DeleteDir(f);
                }else{
                    f.delete();
                }
            }
        }



    }
}
