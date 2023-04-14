package com.itheima.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {

        // 1. 单独编写实现类, 实现接口, 重写方法, 传入实现类对象
        // 2. 匿名内部类
        // 3. Lambda表达式
        useShowHandler(() -> System.out.println("我是匿名内部类重写后的show方法"));

        useShowHandler(() -> System.out.println("我是Lambda重写后的show方法"));

    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

interface ShowHandler {
    void show();
}