package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    /*
        今后如果要通过Java代码, 关联文件和文件夹, 只需要创建File对象即可

        创建File类的对象, 关联要操作的文件和文件夹
            构造方法:

                1. public File(String pathname) : 根据传入的路径名, 封装File对象
                2. public File(String parent, String child) : 根据传入的父级路径和子级路径来封装File对象
                3. public File(File parent, String child) : 根据传入的父级路径和子级路径来封装File对象
     */
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\A.txt");
        System.out.println(f1.exists());

        File f2 = new File("D:\\Develop");
        System.out.println(f2.exists());

        File f3 = new File("D:\\", "Develop");
        System.out.println(f3.exists());

        File f4 = new File(new File("D:\\"), "Develop");
        System.out.println(f4.exists());

        File f5 = new File("D:\\abc.txt");
        System.out.println(f5.createNewFile());
    }
}
