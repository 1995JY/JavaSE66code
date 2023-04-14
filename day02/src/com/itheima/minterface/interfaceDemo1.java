package com.itheima.minterface;

public class interfaceDemo1 {
    public static void main(String[] args) {

    }
}
interface animal{

    public abstract void eat();
    public abstract void sleep();


}
class dog implements animal {
    public void eat(){
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("晚上睡觉");
    }
}
class cat implements animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("白天睡觉");
    }
}
class pig implements animal {
    @Override
    public void eat() {
        System.out.println("猪什么都吃");
    }
    @Override
    public void sleep() {
        System.out.println("猪吃完就睡");
    }
}

