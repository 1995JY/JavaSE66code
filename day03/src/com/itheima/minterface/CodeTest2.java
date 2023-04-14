package com.itheima.minterface;
/*
CodeTest2静态代码块
Demo类静态代码块...
Demo类构造代码块
Demo类带参构造方法
CodeTest2构造代码块
 */
public class CodeTest2 {
    static {
        System.out.println("CodeTest2静态代码块");
    }

    {
        System.out.println("CodeTest2构造代码块");
    }

    public static void main(String[] args) {
        Demo d = new Demo(10);
        CodeTest2 c = new CodeTest2();
    }
}

class Demo {

    static {
        System.out.println("Demo类静态代码块...");
    }

    {
        System.out.println("Demo类构造代码块");
    }

    public Demo() {
        System.out.println("Demo类无参构造方法");
    }

    public Demo(int num) {
        System.out.println("Demo类带参构造方法");
    }

}
