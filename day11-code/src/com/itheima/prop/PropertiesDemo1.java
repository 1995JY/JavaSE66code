package com.itheima.prop;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo1 {
    /*
        Properties作为集合的使用
     */
    public static void main(String[] args) {

        Properties prop = new Properties();

        prop.setProperty("username", "admin");
        prop.setProperty("password", "123456");

        // 获取集合中所有的键 (Enumeration : 迭代器)
        Enumeration<?> enumeration = prop.propertyNames();

        // 循环判断是否还有下一个元素
        while(enumeration.hasMoreElements()){
            // 获取元素 (键)
            Object o = enumeration.nextElement();
            System.out.println(o + "---" + prop.getProperty(o.toString()));
        }

    }

    private static void method() {
        Properties prop = new Properties();

        prop.setProperty("username", "admin");
        prop.setProperty("password", "123456");

        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }
}
