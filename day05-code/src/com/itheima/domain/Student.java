package com.itheima.domain;

import com.itheima.test.AgeException;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
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
        if(age >= 0 && age <= 120){
            this.age = age;
        }else{
            throw new AgeException("年龄有误, 请检查是否是0~120之间");
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
