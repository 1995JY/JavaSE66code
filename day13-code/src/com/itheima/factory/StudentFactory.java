package com.itheima.factory;

public class StudentFactory {

    public static Student getInstance(){
        Student stu = new Student(1,2,3,4,5,6);
        return stu;
    }

}
