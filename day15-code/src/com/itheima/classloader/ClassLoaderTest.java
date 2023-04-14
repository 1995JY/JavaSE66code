package com.itheima.classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {

        // AppClassLoader : 加载自己写的类
        ClassLoader classLoader = Student.class.getClassLoader();

        ClassLoader fatherClassLoader = classLoader.getParent();

        ClassLoader grandFatherClassLoader = fatherClassLoader.getParent();

        System.out.println(grandFatherClassLoader);

    }
}

class Student {

}
