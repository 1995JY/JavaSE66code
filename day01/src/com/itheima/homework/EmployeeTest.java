package com.itheima.homework;
/*
1.定义项目经理类
属性：姓名 工号 工资 奖金
行为：工作work
2.定义程序员类
属性：姓名 工号 工资
行为：工作work
3.向上抽取一个父类,让这两个类都继承这个父类,共有的属性写在父类中，子类重写父类中的方法
4.编写测试类:完成这两个类的测试
 */
public class EmployeeTest {
    public static void main(String[] args) {
        CodeWorker c=new CodeWorker("张三","heima0001",6000);
        c.work();
        Manager m=new Manager("李四","heima0002",8000,3000);
        m.work();
    }
}
class Employee{
    private String name;
    private String ID;
    private int salary;

    public Employee() {

    }
    public Employee(String name, String ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("所有员工都需要工作");

    }
}
class CodeWorker extends Employee{
    public CodeWorker() {
    }

    public CodeWorker(String name, String ID, int salary) {
        super(name, ID, salary);
    }
    @Override
    public void work(){
        System.out.println("员工姓名为："+getName()+",工号为："+getID()+",工资为："
        +getSalary()+"的员工是程序猿，正在努力的敲代码");
    }
}
class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager() {

    }

    public Manager(String name, String ID, int salary, int bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("员工姓名为："+getName()+",工号为："+getID()+",工资为："
                +getSalary()+"奖金为："+getBonus()+",的员工是项目经理，不用敲代码");
    }
}
