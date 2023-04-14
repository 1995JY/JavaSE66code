package com.itheima.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.function.BiConsumer;

/*
请编写程序，定义一个Properties对象，将文件”test1.properties”的内容
读取到Properties对象中，遍历，并打印每个键值对
 */
public class test02 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("day11\\src\\com\\itheima\\homework\\test1.properties");
        p.load(fis);
        fis.close();
        Enumeration<?> e = p.propertyNames();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o+"---"+p.getProperty(o.toString()));

        }


    }
}
