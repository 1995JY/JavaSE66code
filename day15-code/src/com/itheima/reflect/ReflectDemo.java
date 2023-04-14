package com.itheima.reflect;

import com.itheima.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectDemo {
    /*
        代码演示: 如何获取类的字节码对象

            三种方式分类

                        1. Class.forName(全类名)方法
                        2. 类名.class属性
                        3. 对象名.getClass()方法
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        // 1. Class.forName(全类名)方法
        Class<?> class1 = Class.forName("com.itheima.domain.Student");
        System.out.println(class1);

        // 2. 类名.class属性
        Class<Student> class2 = Student.class;
        System.out.println(class2);

        // 3. 对象名.getClass()方法
        Student stu = new Student();
        Class<? extends Student> class3 = stu.getClass();
        System.out.println(class3);

        System.out.println(class1 == class2);
        System.out.println(class2 == class3);
        System.out.println(class3 == class1);

        System.out.println("----------------------------------------");

        // 1. 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // 2. 使用系统类加载器, 加载src目录下的配置文件
        InputStream is = systemClassLoader.getResourceAsStream("A.properties");
        // 3. 创建Properties对象, 准备加载配置文件
        Properties prop = new Properties();
        // 4. 加载
        prop.load(is);
        // 5. 根据键找值, 找到的值是 [全类名]
        String className = prop.getProperty("className");
        // 6. 根据全类名, 获取类的字节码对象
        Class<?> aClass = Class.forName(className);
        // 7. 打印
        System.out.println(aClass);

    }
}
