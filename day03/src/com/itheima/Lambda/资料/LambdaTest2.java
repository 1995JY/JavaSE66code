package com.itheima.Lambda.资料;

public class LambdaTest2 {
    public static void main(String[] args) {
//使用匿名内部类的方法调用方法
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {

                System.out.println("这是使用匿名内部类的调用方法----" + msg);
            }
        });
        // 使用lambda表达式调用方法。
        useStringHandler((String msg) -> {
            System.out.println("这是使用Lambda表达式的调用方法----" + msg);
        });
    }

    public static void useStringHandler(StringHandler stringHandler) {

        stringHandler.printMessage("itheima");
    }
}

interface StringHandler {
    void printMessage(String msg);
}
