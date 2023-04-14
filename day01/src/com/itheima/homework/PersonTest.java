package com.itheima.homework;
/*
    1.定义Person类
		属性：姓名name、性别gender、年龄age、国籍nationality；
		方法：吃饭eat、睡觉sleep，工作work。
	2.根据人类，创建一个学生类Student
		增加属性：学校school、学号stuNumber；
		重写工作方法（学生的工作是学习）。
	3.根据人类，创建一个工人类Worker
		增加属性：单位unit、工龄workAge；
		重写工作方法（工人的工作是盖房子）。
	4.根据学生类，创建一个学生干部类 StudentLeader
		增加属性：职务job；
		增加方法：开会meeting。
	5.编写测试类分别对上述3类具体人物进行测试。
	6.要求运行结果:
	学生需要学习!
    工人的工作是盖房子!
    学生干部喜欢开会!
 */
public class PersonTest {
    public static void main(String[] args) {
        Student stu1=new Student("张三","男",23,
                "中国","传智教育","heima001");
        stu1.work();
        StudentLeader stu2=new StudentLeader("张三","男", 23,
                "中国","传智教育","heima001","学习委员","学习会议");
        stu2.meeting();
        Worker w=new Worker("传智",5);
        System.out.println(w.getName());
        System.out.println(w.getGender());
        System.out.println(w.getAge());
        System.out.println(w.getNationality());
        System.out.println(w.getUnit());
        System.out.println(w.getWorkAge());
        w.work();


    }
}
class Person{
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void work(){

    }
}
class Student extends Person{
    private String school;
    private String stuNumber;

    public Student() {

    }

    public Student(String name, String gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
    @Override
    public void work(){
        System.out.println("学生需要学习");
    }
}
class StudentLeader extends Student{
    private String job;
    private String meeting;

    public StudentLeader() {

    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber, String job, String meeting) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
        this.meeting = meeting;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMeeting() {
        return meeting;
    }

    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    public void meeting(){
        System.out.println("学生干部喜欢开会");
    }
}
class Worker extends Person{
    private String unit;
    private int workAge;

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    @Override
    public void work(){
        System.out.println("工人的工作是盖房子");
    }
}
