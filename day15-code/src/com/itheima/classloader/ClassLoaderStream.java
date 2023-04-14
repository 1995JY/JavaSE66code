package com.itheima.classloader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderStream {
    public static void main(String[] args) throws IOException {

        // 获取系统类加载器 (Application ClassLoader : 加载我们自己写的类文件)
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        // 使用类加载器的getResourceAsStream, 从src文件夹下加载配置文件
        InputStream is = systemClassLoader.getResourceAsStream("A.properties");

        Properties prop = new Properties();

        prop.load(is);

        is.close();

        System.out.println(prop);
    }
}
