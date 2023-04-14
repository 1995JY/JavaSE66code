package com.itheima.prop;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties  p=new Properties();
        p.setProperty("username","admin");
        p.setProperty("password","123456");
        Enumeration<?> e = p.propertyNames();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o+"---"+p.getProperty(o.toString()));
        }
    }
}
