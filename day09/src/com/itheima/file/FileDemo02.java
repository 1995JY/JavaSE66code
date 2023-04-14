package com.itheima.file;

import java.io.File;
import java.util.Scanner;

public class FileDemo02 {
    public static void main(String[] args) {
        File file=getDir();
        System.out.println(file);
    }

    public static File getDir() {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个文件的路径：");
            String path= sc.nextLine();
            File f1=new File(path);
            if(!f1.exists()){
                System.out.println("您输入的文件不存在！请重新输入：");
            }else if(f1.isFile()){
                System.out.println("您输入的是一个文件路径，并不是文件夹路径，请重新输入");
            }else{
                return f1;
            }
        }
    }
}
