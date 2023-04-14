package com.itheima.homework;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        Student stu1=new Student("张三",23,"15611111111");
        Student stu2=new Student("李四",24,"15622222222");
        Student stu3=new Student("王五",25,"1561111JQKA");
        Student stu4=new Student("赵六",26,"233");
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        for (int i = 0; i < arr.size(); i++) {
            if(checkNumber(arr.get(i))==false){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr.toString());



    }
    public static boolean checkNumber(Student stu){
        if(stu.getPhoneNumber().length()!=11){
            return false;
        }
        if((stu.getPhoneNumber().charAt(0)=='1')&&(stu.getPhoneNumber().charAt(1)>='3')){
            for(int i=2;i<stu.getPhoneNumber().length();i++){
                if((stu.getPhoneNumber().charAt(i)<='0')||(stu.getPhoneNumber().charAt(i)>='9')){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }

    }
}

class Student{
    private String name;
    private int age;
    private String phoneNumber;

    public Student() {
    }

    public Student(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

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
        this.age = age;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", phoneNumber = " + phoneNumber + "}";
    }
}

