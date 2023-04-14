package com.itheima.prop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

        prop.setProperty("username", "root");
        prop.setProperty("password", "123456");

        FileOutputStream fos = new FileOutputStream("day11-code\\info.properties");

        prop.store(fos, null);

        fos.close();

    }
}
