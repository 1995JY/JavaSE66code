package com.itheima.mextends;

public class mextends {
    public static void main(String[] args) {
        manager m1=new manager();
        m1.setAge(13);
        m1.setName("张三");
        m1.setID("a001");
        m1.setSalary(5000);

    }
}
 class Employee{
    private String ID;
    private String name;
    private int age;
    private int salary;


     public Employee() {
     }

     public Employee(String ID, String name, int age, int salary) {
         this.ID = ID;
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     /**
      * 获取
      * @return ID
      */
     public String getID() {
         return ID;
     }

     /**
      * 设置
      * @param ID
      */
     public void setID(String ID) {
         this.ID = ID;
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
         this.age = age;
     }

     /**
      * 获取
      * @return salary
      */
     public int getSalary() {
         return salary;
     }

     /**
      * 设置
      * @param salary
      */
     public void setSalary(int salary) {
         this.salary = salary;
     }

 }
 class coder extends Employee {

 }
 class manager extends Employee {


 }
