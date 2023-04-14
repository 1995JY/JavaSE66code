package com.itheima.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderStream {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("A.properties");
        Properties prop=new Properties();
        prop.load(is);
        is.close();
        System.out.println(prop);



    }
}
