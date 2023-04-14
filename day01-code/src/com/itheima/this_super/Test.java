package com.itheima.this_super;


public class Test {
    public static void main(String[] args){
        A a = new A(1, 2, 3);
        A a2 = new A(1, 2, 3, 4, 5);

    }
}

/*
    Version 1.0 : 有三个成员变量
    --------------------------------
    Version 2.0 : 新增2个成员变量
 */
class A /*extends Object*/{
    int a;
    int b;
    int c;
    int d;
    int e;

    public A() {
    }

    public A(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d, int e) {
        this(a, b, c);
        this.d = d;
        this.e = e;
    }
}
