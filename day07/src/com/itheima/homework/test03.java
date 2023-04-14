package com.itheima.homework;

import java.util.Comparator;
import java.util.TreeSet;

public class test03 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int chineseResult=(int)(o2.getChinese()-o1.getChinese());
                int englishResult=chineseResult==0?(int)(o2.getEnglish()-o1.getEnglish()):chineseResult;
                int ageResult=englishResult==0?(o2.getAge()-o1.getAge()):englishResult;
                int result=ageResult==0?1:ageResult;
                return result;

            }
        });
        ts.add(new Student("张三",23,89,92,77));
        ts.add(new Student("张三",15,89,92,77));
        ts.add(new Student("李四",24,91,97,77));
        ts.add(new Student("张三",18,97,92,77));
        ts.add(new Student("赵六",23,100,88,77));
        ts.add(new Student("张三",23,89,92,77));
        ts.add(new Student("西门",23,65,92,77));

        System.out.println(ts);

    }
}
class Student{
    private String name;
    private int age;
    private double math;
    private double chinese;
    private double english;

    public Student() {
    }

    public Student(String name, int age, double math, double chinese, double english) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
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
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "\n"+"Student{name = " + name + ", age = " + age + ", math = " + math + ", chinese = " + chinese + ", english = " + english + "}";
    }
}
