package com.itheima.duotai;


public class DuoTaiDemo1 {
    /*
        多态的前提 :
            1. 继承 \ 实现关系
            2. 要有方法重写
            3. 要有父类引用指向子类对象

        多态的好处 :

            提高了代码的扩展性.

            - 将一个方法的形参, 设计为父类类型, 这个方法就可以接收该父类的任意子类对象了.

        多态的弊端 :

            不能调用子类特有的属性和行为

                    - 如果你的目的是为了调用子类特有的方法, 请不要使用多态, 直接创建子类对象

            解决方案:
                    - 向下转型

        -----------------------------------------------------------------------------------

        多态的转型 :

                1. 向上转型(隐式转换) : 父类引用指向子类对象
                                Animal a = new Dog();

                2. 向下转型(强制转换) : 将子类的对象, 重新交给子类的引用
                                Dog d = (Dog) a;

        ClassCastException : 类型转换异常

                - 引用数据类型的强转中, 实际类型和目标类型不匹配, 就会出现此异常.

     */
    public static void main(String[] args) {

        useAnimal(new Dog());
        useAnimal(new Cat());


    }

    public static void useAnimal(Animal a) {        // Animal a = new Dog();
                                                    // Animal a = new Cat();
        a.eat();

        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHome();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }

    }

}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉...");
    }

    public void watchHome() {
        System.out.println("狗看家...");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠...");
    }
}
