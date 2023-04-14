package com.itheima.object_stream;

import com.itheima.domain.Student;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamDemo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu1=new Student("张三",23);
        Student stu2=new Student("李四",24);
        Student stu3=new Student("王五",25);
        Student stu4=new Student("赵六",26);
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
//        ObjectOutputStream ous=new ObjectOutputStream(new FileOutputStream("day11\\stu.txt"));
//        ous.writeObject(arr);
//        ous.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day11\\stu.txt"));
        ArrayList<Student> o = (ArrayList<Student>) ois.readObject();
        System.out.println(o);
    }
}
