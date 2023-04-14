package com.itheima.set;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        // 根据年龄作为主要排序条件, 根据姓名作为次要排序条件 (降序)
        // 升序 : this - o
        // 降序 : o - this
        int ageResult = o.age - this.age;
        int nameResult = ageResult == 0 ? o.name.compareTo(this.name) : ageResult;
        int result = nameResult == 0 ? 1 : nameResult;
        return result;
    }

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }



}
