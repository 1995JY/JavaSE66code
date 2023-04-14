package com.itheima.homework;

import com.itheima.domain.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
1. 请定义一个Student类
   * 属性：姓名、性别、年龄、分数
   * 无参、全参构造方法
   * get/set方法
2. 定义测试类，编写main()方法：
//1.定义一个集合
List<Student> stuList = new ArrayList<>();
stuList.add(new Student(“张三”,”男”,20,88);
stuList.add(new Student(“李四”,”女”,19,99);
3. 遍历这个集合，将每个Student对象中的数据按以下格式写到项目根目录下的student.txt中：
张三,男,20,88
李四,女,19,99
 */
public class test03 {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三","男",20,88));
        stuList.add(new Student("李四","女",19,99));
        FileOutputStream fos=new FileOutputStream("E:\\IO流操作\\2023.04.02-homework\\student.txt");
        for (Student student : stuList) {
            String str=student.toString()+"\r\n";
            System.out.println(str);
            //这里为什么加上了起始位置和写入个数，就会写入有问题？
            fos.write(str.getBytes());
        }
            fos.close();
    }
}
