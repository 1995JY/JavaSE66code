package com.itheima.homework;
import com.itheima.domain.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.

* 创建5个学生放到 ArrayList中.使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 */
public class test06 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三",23,60.0));
        list.add(new Student("李四",24,70.0));
        list.add(new Student("王五",26,80));
        list.add(new Student("西门吹雪",27,90.0));
        list.add(new Student("法外狂徒",23,100));
        Iterator<Student> it = list.iterator();
        int count=0;
        double total=0;
        double max=0;
        double min=list.get(0).getScore();
        while(it.hasNext()){
                Student stu=it.next();
                total+=stu.getScore();
                if(max<stu.getScore()){
                    max=stu.getScore();
            }
                if(min>stu.getScore()){
                    min=stu.getScore();
            }
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        System.out.println("总分为："+total);
        System.out.println("平均分为："+total/6);


    }

}

