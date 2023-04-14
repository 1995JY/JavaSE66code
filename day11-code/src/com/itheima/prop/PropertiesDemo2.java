package com.itheima.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    /*
        Properties : 加载配置文件

            配置文件 : 程序中一些灵活多变的信息, 放在了文件中存储
     */
    public static void main(String[] args) throws IOException {
        // 1. 创建空的集合
        Properties prop = new Properties();
        // 2. 创建输入流, 关联要读取的文件
        FileInputStream fis = new FileInputStream("day11-code\\config.properties");
        // 3. 从流中加载数据 (键值对)
        prop.load(fis);
        fis.close();

        // 4. 根据键找值 (将配置文件中, 键对对应的值取出来进行使用)
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }
}
