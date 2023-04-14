package com.itheima.test;

import java.io.File;
import java.util.Scanner;

public class FileTest1 {
    /*
        需求: 定义一个方法, 从键盘录入一个文件夹路径, 如果输入错误, 给出提示并继续录入!
     */
    public static void main(String[] args) {
        File dir = getDir();
        System.out.println(dir);
    }

    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径: ");

        while (true) {
            String path = sc.nextLine();

            // 1. 将键盘录入的路径, 封装为File对象
            File dir = new File(path);

            // 2. 判读是否存在
            if (!dir.exists()) {
                System.out.println("您输入的文件夹路径不存在, 请重新输入: ");
            } else if (dir.isFile()) {
                System.out.println("您输入的是一个文件路径, 请重新输入一个文件夹路径: ");
            } else {
                return dir;
            }
        }
    }

}
