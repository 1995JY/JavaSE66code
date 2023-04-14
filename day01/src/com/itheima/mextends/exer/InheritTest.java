package com.itheima.mextends.exer;

public class InheritTest {
    public static void main(String[] args) {
        Coder02 c2=new Coder02();
        c2.setName("李四");
        c2.setAge(24);
        c2.setSalary(5000);
        c2.work();
        Manager02 m2=new Manager02();
        m2.setName("张三");
        m2.setBonus(6000);
        m2.setAge(27);
        m2.setSalary(3000);
        m2.work();

    }
}
