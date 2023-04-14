package com.itheima.test;

public class EmployeeTest {
    public static void main(String[] args) {

        Coder c = new Coder("张三", 23, 12000);
        c.work();

        Manager m = new Manager("李四", 24, 18000, 5000);
        m.work();

    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work() {
        System.out.println("员工工作...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Coder extends Employee {

    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为" + getName()
                + ",年龄为" + getAge()
                + ",工资为" + getSalary() + "的程序员正在编写代码...");
    }
}

class Manager extends Employee {

    public Manager() {
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为" + super.getName() + ",年龄为" + getAge() + ",工资为" + getSalary() + ", 奖金为" + bonus + ", 的项目经理正在分配任务...");
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
