package com.itheima.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test03 {
    public static void main(String[] args) throws IOException {
        List<Student> stuList=new ArrayList<>();
        stuList.add(new Student("迪丽热巴","女",18,99));
        stuList.add(new Student("古力娜扎","女",19,98));
        stuList.add(new Student("周杰伦","男",20,88));
        stuList.add(new Student("蔡徐坤","男",19,78));
        BufferedWriter bw=new BufferedWriter(new FileWriter("day11\\src\\com\\itheima\\homework\\test02.txt"));
        for (Student s : stuList) {
            bw.write(s.toString());
            bw.write("\r\n");
        }
        bw.close();

    }
}
class Student{
    private String name;
    private String gender;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, String gender, int age, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return  name + "," + gender + "," + age + "," + score;
    }
}
