package com.itheima.mextends.exer;

public class Coder02 extends Employee02 {
    public Coder02(){

    }
    public Coder02(String name,int age,int salary){
        super(name,age,salary);
    }

    public void work(){
        System.out.println("姓名为"+super.getName()+"，年龄为"+super.getAge()+"，工资为"+super.getSalary()+"，正在努力敲代码");
    }
}
