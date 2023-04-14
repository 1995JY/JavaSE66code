package com.itheima.test;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄:");
        int age=0;
        while(true){
            try {
               age=Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入年龄格式有误，请重新输入：");
            }catch(RuntimeException e){
                System.out.println("输入年龄范围有误，请重新输入：");
                e.getMessage();
            }
        }
        Student stu=new Student(name,age);
        System.out.println(stu);
    }
}
class Student{
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
        if(age>0||age<120){
            this.age = age;
        }else{
            throw new RuntimeException("年龄有误，请检查是否是0-120之间");
        }

    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}