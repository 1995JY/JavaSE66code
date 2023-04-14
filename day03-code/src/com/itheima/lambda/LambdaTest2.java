package com.itheima.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {

        useStringHandler(msg -> System.out.println("我是匿名内部类重写的方法..." + msg));

        useStringHandler(msg ->
            System.out.println("我是Lambda重写的方法..." + msg)
        );

    }

    /*
        多态 :

        StringHandler stringHandler = new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("我是匿名内部类重写的方法..." + msg);
            }
        }
     */
    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("itheima");
    }
}

interface StringHandler {
    void printMessage(String msg);
}
