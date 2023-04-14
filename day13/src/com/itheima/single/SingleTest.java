package com.itheima.single;

public class SingleTest {
    public static void main(String[] args) {
        Student stu = Student.getInstance();
    }
}
class Student{
    private Student(){

    }
    private static final Student stu=new Student();
    public static Student getInstance(){
        return stu;
    }

}