package com.itheima.homework;

import com.itheima.domain.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*

 */
public class test06 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day11\\src\\com\\itheima\\homework\\test03.txt"));
        User o = (User)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
