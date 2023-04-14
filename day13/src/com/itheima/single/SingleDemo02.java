package com.itheima.single;

public class SingleDemo02 {
}
class Student02{
    private Student02(){

    }
    static Student02 stu;
    public static Student02 getInstance(){
        if(stu==null){
            synchronized (Student02.class) {
                if(stu==null){
                    stu=new Student02();
                }
            }
        }

        return stu;
    }
}
