package com.itheima.test;

import com.itheima.domain.Student;

import java.util.Scanner;

public class ExceptionTest1 {
    /*
        需求: 以字符串的形式, 从键盘录入学生的姓名和年龄, 将数据封装为学生对象
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄:");

        int age = 0;

        while(true){
            try {
                age = Integer.parseInt(sc.nextLine());
                Student stu = new Student(name, age);
                System.out.println(stu);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您的年龄输入有误, 请重新输入: ");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}

