package com.itheima.homework;

import java.io.FileInputStream;
import java.io.IOException;

/*
需求 : 在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成) 定义一个方法统计test.txt文件中指定字符出现的次数。

比如，输出：a出现10次
 */
public class test05 {
    public static void main(String[] args) throws IOException {
        countNumber("E:\\IO流操作\\2023.04.02-homework\\test06.txt","a");
    }

    private static int countNumber(String absolutePath,String targetLetter) throws IOException {
        FileInputStream fis=new FileInputStream(absolutePath);
        int i;
        String str=null;
        while((i=fis.read())!=-1){
            str+=(char)i;
        }
        String[] sArr=str.split(targetLetter);
        System.out.println("a字符出现的次数为"+(sArr.length-1));
        fis.close();
        return sArr.length-1;
    }
}
