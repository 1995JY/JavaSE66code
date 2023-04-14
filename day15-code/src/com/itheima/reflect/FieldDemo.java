package com.itheima.reflect;

import com.itheima.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldDemo {
    /*
        通过反射获取类的成员变量使用

            1. 赋值
            2. 获取
     */
    public static void main(String[] args) throws Exception {
        // 1. 获取类的字节码对象
        Class<Student> studentClass = Student.class;

        // 反射获取构造方法并创建对象
        Constructor<Student> constructor = studentClass.getConstructor();
        Student stu = constructor.newInstance();

        // 2. 获取类的成员变量对象
        Field nameField = studentClass.getDeclaredField("name");
        nameField.setAccessible(true);

        Field ageField = studentClass.getDeclaredField("age");
        ageField.setAccessible(true);

        // 3. 赋值 (参数1: 绑定的对象   参数2: 实际参数)
        nameField.set(stu, "张三");
        ageField.set(stu, 23);

        // 4. 获取 (获取哪一个对象中属性)
        System.out.println(nameField.get(stu));
        System.out.println(ageField.get(stu));

    }
}
