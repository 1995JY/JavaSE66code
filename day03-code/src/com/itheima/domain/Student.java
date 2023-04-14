package com.itheima.domain;


import java.util.Objects;


/*

        public static boolean equals(Object a, Object b) {

            a != null :
                            true :  说明a记录的值, 不是null

                                            a.equals(b)

                            false :  说明a记录的值, 是null


            return (a == b) || (a != null && a.equals(b));
        }

 */

public class Student {

    private String name;
    private int age;


    @Override
    public boolean equals(Object o) {
        // this : stu1
        // o : stu2
        if (this == o) {
            // 比较两个对象的地址, 如果地址相同, 直接返回true
            return true;
        }

        // 代码要是能够执行到这里, 代表调用者(stu1)肯定不是null
        if (o == null || this.getClass() != o.getClass()) {
            // 如果o(stu2)为null的话, 直接返回false
            // this.getClass() != o.getClass() : 比较两个对象的字节码文件是否是同一份
            return false;
        }

        // 代码要是能够执行到这里, 说明字节码肯定相同 (类型肯定相同)
        Student student = (Student) o;
        // 向下转型之后, 比较具体的内容
        return this.age == student.age && Objects.equals(this.name, student.name);
    }



    public Student() {
    }

    public Student(String name, int age) {
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
