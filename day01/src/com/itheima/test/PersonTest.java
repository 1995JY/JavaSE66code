package com.itheima.test;

public class PersonTest {
    public static void main(String[] args) {
        Student s1=new Student("张三",18,99);
        System.out.println(s1.getName()+"----"+s1.getAge()+"----"+ s1.getScore());

    }
}
class Person{
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

}
class Teacher extends Person {
    public void Teacher(){

    }
    public Teacher(String name,int age){
        super(name, age);

    }
}
class Student extends Person{
    public Student(){

    }
    public Student(String name,int age,int score){
        super(name,age);
        this.score=score;
    }
    private int score;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
