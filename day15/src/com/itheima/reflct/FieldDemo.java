package com.itheima.reflct;

import com.itheima.domain.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor1 = studentClass.getConstructor();
        Student student = constructor1.newInstance();

        Field nameField = studentClass.getDeclaredField("name");
        nameField.setAccessible(true);
        Field ageField = studentClass.getDeclaredField("age");
        ageField.setAccessible(true);
        nameField.set(student,"张三");
        ageField.set(student,23);
        System.out.println(student);
        System.out.println(nameField.get(student));
        System.out.println(ageField.get(student));


    }
}
