package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    /*
        细节1: 创建File对象的时候, 如果路径不存在, 也不会出现错误

        细节2: 路径的编写

                    A : 绝对路径 - 从盘符的根目录开始, 一直到某一个具体的文件或文件夹 (路径写全了)
                                    D:\\A.txt
                    B : 相对路径 - 相对于当前的项目路径进行使用
                                    D:\\AdvanceCodes-66\\

     */
    public static void main(String[] args) throws IOException {

        File f1 = new File("day09-code\\A.txt");
        System.out.println(f1.createNewFile());

    }
}
