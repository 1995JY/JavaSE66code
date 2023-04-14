package com.itheima.mabstract;

public class AbstractDemo1 {
    /*
        抽象类 : 就是一种特殊的父类
                    特殊点: 内部允许编写抽象方法

        抽象方法 : 当我们将共性的行为(方法), 抽取到父类之后, 发现这个方法, 在父类中无法给出具体明确(描述不清了)
                    - 这种方法就应该设计为抽象方法.
                    - 抽象方法, 是强制要求子类重写的方法.
     */
    public static void main(String[] args) {

    }
}

abstract class Animal {
    public abstract void eat();

    public Animal(){

    }

    public void drink() {
        System.out.println("动物喝水...");
    }
}

abstract class Pig extends Animal {

}

class Dog extends Animal {

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
