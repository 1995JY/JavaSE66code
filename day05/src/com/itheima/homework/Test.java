package com.itheima.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = new Student();
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            arr[i].setName(sc.nextLine());
            //获取年龄
            while (true) {
                System.out.println("请输入学生的年龄：");
                try {
                    arr[i].setAge(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (WrongAgeException a) {
                    System.out.println(a.getMessage());
                }
            }
            //获取英语成绩
            while (true) {
                System.out.println("请输入学生的英语成绩：");
                try {
                    arr[i].setEnglishScore(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (WrongEnglishScoreException a) {
                    System.out.println(a.getMessage());
                }
            }
            //获取数学成绩
            while (true) {
                System.out.println("请输入学生的数学成绩：");
                try {
                    arr[i].setMathScore(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (WrongMathScoreException a) {
                    System.out.println(a.getMessage());
                }
            }
            //获取语文成绩
            while (true) {
                System.out.println("请输入学生的语文成绩：");
                try {
                    arr[i].setChineseScore(Integer.parseInt(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (WrongChineseScoreException a) {
                    System.out.println(a.getMessage());
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class Student{
   private String name;
   private int age;
   private int mathScore;
   private int englishScore;
   private int chineseScore;


    public Student() {
    }

    public Student(String name, int age, int mathScore, int englishScore, int chineseScore) {
        this.name = name;
        setAge(age);
        setMathScore(mathScore);
        setEnglishScore(englishScore);
        setChineseScore(chineseScore);
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
        if(age>=0&&age<=120){
            this.age = age;
        }else{
            throw  new WrongAgeException("年龄输入有误，请重新输入");
        }

    }

    /**
     * 获取
     * @return mathScore
     */
    public int getMathScore() {
        return mathScore;
    }

    /**
     * 设置
     * @param mathScore
     */
    public void setMathScore(int mathScore) {
        if(mathScore>=0&&mathScore<=100){
            this.mathScore = mathScore;
        }else{
            throw new WrongMathScoreException("数学成绩输入有误，请重新输入：");
        }

    }

    /**
     * 获取
     * @return englishScore
     */
    public int getEnglishScore() {
        return englishScore;
    }

    /**
     * 设置
     * @param englishScore
     */
    public void setEnglishScore(int englishScore) {
        if(englishScore>=0&&englishScore<=100){
            this.englishScore = englishScore;
        }else{
            throw new WrongEnglishScoreException("英语成绩输入有误，请重新输入：");
        }

    }

    /**
     * 获取
     * @return chineseScore
     */
    public int getChineseScore() {
        return chineseScore;
    }

    /**
     * 设置
     * @param chineseScore
     */
    public void setChineseScore(int chineseScore) {
        if(chineseScore>=0&&chineseScore<=100){
            this.chineseScore = chineseScore;
        }else{
            throw new WrongChineseScoreException("语文成绩输入有误，请重新输入：");
        }

    }

    public String toString() {
        return "Stuent{name = " + name + ", age = " + age + ", mathScore = " + mathScore + ", englishScore = " + englishScore + ", chineseScore = " + chineseScore + "}";
    }
}
