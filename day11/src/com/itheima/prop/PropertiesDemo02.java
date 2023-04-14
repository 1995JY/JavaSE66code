package com.itheima.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("day11\\config.properties");
        p.load(fis);
        fis.close();
        System.out.println(p);
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("username"));
    }
}
