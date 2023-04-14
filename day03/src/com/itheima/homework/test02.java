package com.itheima.homework;

public class test02 {
    public static void main(String[] args) {
        Student stu=new Student("张三",23,"15678934565");
        if(stu.getPhoneNumber().length()!=11){
            System.out.println("不是");
        }
        if((stu.getPhoneNumber().charAt(0)=='1')&&(stu.getPhoneNumber().charAt(1)>'3')){
            for(int i=2;i<stu.getPhoneNumber().length();i++){
                if((stu.getPhoneNumber().charAt(i)<'0')||(stu.getPhoneNumber().charAt(i)>'9')){
                    System.out.println("不是");
                }
            }
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
        boolean flag=checkNumber(stu);
        System.out.println(flag);
    }
    public static boolean checkNumber(Student stu){
        if(stu.getPhoneNumber().length()!=11){
            return false;
        }
        if((stu.getPhoneNumber().charAt(0)=='1')&&(stu.getPhoneNumber().charAt(1)>='3')){
            for(int i=2;i<stu.getPhoneNumber().length();i++){
                if((stu.getPhoneNumber().charAt(i)<'0')||(stu.getPhoneNumber().charAt(i)>'9')){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }

    }
}
