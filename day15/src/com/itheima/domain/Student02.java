package com.itheima.domain;

public class Student02 {
    private String name;
    private int age;

    public void study(){
        System.out.println("学生学习。。。。");
    }
    public void eat(){
        System.out.println("学生吃饭。。。。");
    }

    public Student02() {
    }

    public Student02(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Student02{name = " + name + ", age = " + age + "}";
    }
}
