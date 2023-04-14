package com.itheima.mextends.exer;

import com.itheima.mextends.exer.Coder02;

public class Manager02 extends Coder02 {
    public  Manager02(){

    }
    public  Manager02(String name,int age,int salary,int bonus){
        super(name,age,salary);
        this.bonus=bonus;
    }
    int bonus;
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("姓名为" + getName() + "，年龄为" + getAge() + "，工资为" + getSalary() + "，奖金为" + getBonus() + "，正在努力敲代码");
    }
}
