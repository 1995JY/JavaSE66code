package com.itheima.lambda.test;

public class Test {
    public static void main(String[] args) {

        useA(new A() {
            @Override
            public void showA() {
                System.out.println("匿名内部类...showA");
            }
        });

        useA(new A() {
            @Override
            public void showA() {
                System.out.println("匿名内部类...showA");
            }
        });

        useA(() ->
                System.out.println("Lambda表达式...showA")
        );

    }

    public static void useA(A a) {
        a.showA();
    }

}

interface A {
    void showA();
}
