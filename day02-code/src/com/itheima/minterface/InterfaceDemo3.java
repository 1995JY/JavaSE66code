package com.itheima.minterface;

public class InterfaceDemo3 {
    /*
        类和接口之间的各种关系 :

            1. 类和类 : 继承关系, 只允许单继承, 不允许多继承, 但是可以多层继承

            2. 类和接口 : 实现关系, 可以单实现, 也可以多实现, 甚至可以在继承一个类的同时, 实现多个接口

            3. 接口与接口 : 继承关系, 可以单继承, 也可以多继承.
     */
    public static void main(String[] args) {

    }
}

class Fu {
    public void show(){
        System.out.println("Fu...show");
    }
}

interface InterA {
    void show();
}

interface InterB {
    void show();
}

interface InterC {
    void show();
}

class InterABCImpl extends Fu implements InterA, InterB, InterC {
    public void show(){
        System.out.println("Fu...show");
    }
}
