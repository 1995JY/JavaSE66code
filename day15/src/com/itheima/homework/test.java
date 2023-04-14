package com.itheima.homework;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws Exception {

//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        InputStream is = classLoader.getResourceAsStream("A.properties");
        //字节流加载配置文件，上面是类加载器加载配置文件
        FileInputStream is=new FileInputStream("day15\\src\\A.properties");
        Properties prop=new Properties();
        prop.load(is);
        is.close();
        System.out.println(prop);
        String str=prop.getProperty("className");
        System.out.println(str);
         Class<?> aClass = Class.forName(str);
        System.out.println(aClass);
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);
        Method methodName = aClass.getMethod(prop.getProperty("methodName"));
        methodName.invoke(o);


    }
}
