package com.itheima.object_straem;

import com.itheima.domain.Student;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamDemo {
    /*
        序列化流(对象流) :

            1. ObjectOutputStream : 写出对象
                        - 方法: writeObject();

            2. ObjectInputStream : 读取对象
                        - 方法: readObject();

            3. 对象如果要被序列化, 需要实现接口Serializable

            4. 建议: 写出数据只写一次, 读取数据也只读取一次


     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //writeObject();
        readObject();

    }

    private static void readObject() throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11-code\\stu.txt"));

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student stu : list) {
            System.out.println(stu);
        }

        ois.close();
    }

    private static void writeObject() throws IOException {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));

        // 1. 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11-code\\stu.txt"));

        // 2. 写出对象
        oos.writeObject(list);

        // 3. 关流
        oos.close();
    }
}
