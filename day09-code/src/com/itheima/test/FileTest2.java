package com.itheima.test;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        File dir = FileTest1.getDir();
        deleteDir(dir);
    }

    private static void deleteDir(File dir) {
        // 1. 获取所有的文件和文件夹对象
        File[] files = dir.listFiles();
        // 2. 遍历数组, 获取每一个文件和文件夹对象
        for (File file : files) {
            // 3. 判断是否是文件
            if (file.isFile()) {
                // 4. 文件可以直接删除
                file.delete();
            } else {
                // 5. 代码执行到这里, 说明file是文件夹
                // 思路: 进入这个文件夹, 继续做删除
                if(file.listFiles() != null){
                    deleteDir(file);
                }
            }
        }

        // 删除空文件夹
        dir.delete();
    }
}
