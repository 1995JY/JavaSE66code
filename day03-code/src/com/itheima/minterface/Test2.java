package com.itheima.minterface;

public class Test2 {
    /*
        B. 接口中允许编写static的方法
     */
    public static void main(String[] args) {
        MyInter.method();

        // MyInterImpl.method();
        // MyInterImpl mm = new MyInterImpl();
        // mm.method();
    }
}

interface MyInter {
    static void method() {
        System.out.println("MyInter...static...method");
    }
}

class MyInterImpl implements MyInter {

}