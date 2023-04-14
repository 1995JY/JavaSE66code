package com.itheima.minterface;

public class InterfaceDemo4 {
    /*
        接口与接口 : 继承关系, 可以单继承, 也可以多继承.
     */
    public static void main(String[] args) {

    }
}

interface A {
    void show();
}

interface B {
    void show();
}


interface C extends A, B {

}

class CImpl implements C {

    @Override
    public void show() {

    }
}