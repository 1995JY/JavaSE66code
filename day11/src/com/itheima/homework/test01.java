package com.itheima.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class test01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("品名","Iphone11 Pro Max");
        pro.setProperty("颜色","暗夜绿");
        pro.setProperty("存储容量","256G");
        pro.setProperty("价格","10899");
        FileOutputStream fos=new FileOutputStream("day11\\src\\com\\itheima\\homework\\test1.properties");
        pro.store(fos,null);
        fos.close();

    }
}
