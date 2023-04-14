package com.itheima.object;

public class ToString {
    public static void main(String[] args) {
        Student stu1=new Student("张三",24);
        Student stu2=new Student("张wu",24);

        System.out.println(stu1.equals(stu2));
    }

}
class Student{
    private String name;
    private int age;

    public boolean equals(Object obj){
         if(obj instanceof Student){
             Student s=(Student)obj;
             if(this.age==s.age&&this.name. equals(s.name)){
                 return true;
             }

         }else{
             return false;
         }
         return false;
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
