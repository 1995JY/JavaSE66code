package com.itheima.test;

public class PersonTest {
    /*
        需求:
                Person类

                1. 老师类
                        属性: 姓名, 年龄
                2. 学生类
                        属性: 姓名, 年龄, 成绩
     */
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 30);
        System.out.println(t.getName() + "---" + t.getAge());

        Student stu = new Student("李四", 24, 100);
        System.out.println(stu.getName() + "---" + stu.getAge() + "---" + stu.getScore());
    }
}

class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

}

class Teacher extends Person {
    public Teacher() {
        super();
    }

    public Teacher(String name, int age) {
        // "张三", 30
        super(name, age);
    }
}

class Student extends Person {

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
