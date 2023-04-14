package com.itheima.domain;

public class Person {

    String name;
    int age;

    public void eat() {
        System.out.println("今天吃了一顿盘古...");
    }

    public void eat(int num) {
        System.out.println("今天吃了" + num + "顿盘古...");
    }

    public Person() {

    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
