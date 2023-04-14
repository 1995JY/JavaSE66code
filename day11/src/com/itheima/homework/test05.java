package com.itheima.homework;

import com.itheima.domain.User;

import java.io.*;

public class test05 {
    public static void main(String[] args) throws IOException {
        User u=new User("迪丽热巴","女",23);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day11\\src\\com\\itheima\\homework\\test03.txt"));
        oos.writeObject(u);
        oos.close();
    }

}
