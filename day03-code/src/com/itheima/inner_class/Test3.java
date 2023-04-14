package com.itheima.inner_class;

public class Test3 {
    public static void main(String[] args) {
        // 创建静态内部类的对象
        Outer2.Inner oi = new Outer2.Inner();
        oi.show();

        Outer2.Inner.print();

        Outer2 o = new Outer2();
        o.method();

    }
}

class Outer2 {

    static class Inner {
        public void show() {
            System.out.println("Inner...show");
        }

        public static void print() {
            System.out.println("Inner...static...print");
        }
    }

    public void method() {

        class Demo {
            public void fun() {
                System.out.println("fun...");
            }
        }

        Demo d = new Demo();
        d.fun();

    }

}
