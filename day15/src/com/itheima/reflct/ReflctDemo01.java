package com.itheima.reflct;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflctDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream is = systemClassLoader.getResourceAsStream("A.properties");
        Properties prop=new Properties();
        prop.load(is);
        is.close();
        String className=prop.getProperty("className");
        Class<?> aClass = Class.forName(className);
        System.out.println(aClass);


    }
}
