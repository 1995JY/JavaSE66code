package com.itheima.object_straem;

import com.itheima.domain.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("day11-code\\stu.txt"));

        String line;

        while((line = br.readLine()) != null){
            String[] sArr = line.split("-");
            Student stu = new Student(sArr[0], Integer.parseInt(sArr[1]));
            System.out.println(stu);
        }

        br.close();
    }

    private static void writeStudentInfo() throws IOException {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));

        FileWriter fw = new FileWriter("day11-code\\stu.txt");

        for (Student stu : list) {
            fw.write(stu.getName() + "-" + stu.getAge());
            fw.write("\r\n");
        }

        fw.close();
    }
}
