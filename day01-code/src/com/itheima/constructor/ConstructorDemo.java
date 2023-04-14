package com.itheima.constructor;

public class ConstructorDemo {
    /*
        继承中构造方法的访问特点 :

            1. 子类初始化之前, 是否有必要提前完成父类的初始化?
                    回答: 有必要, 子类在初始化的时候, 很有可能调用到父类的数据, 如果父类没有提前完成初始化, 子类将找不到父类的数据.

            2. 子类是如何完成父类初始化的呢?
                    线索: 初始化一个对象, 要执行构造方法.
                    答案: 子类初始化的时候, 只要有办法访问到父类的构造方法, 就能完成父类的初始化

            3. 子类是如何访问到父类的构造方法呢?
                    答案: 在子类的所有构造方法中, 都默认隐藏了一句话 super() 在访问父类的空参构造方法.
     */
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi(10);
    }
}

class Fu {
    public Fu(){
        System.out.println("父类空参构造方法执行了...");
    }

    public Fu(int num){
        System.out.println("父类带参数构造方法执行了...");
    }
}

class Zi extends Fu {
    public Zi(){
        System.out.println("...子类空参构造方法执行了");
    }

    public Zi(int num){
        System.out.println("...子类带参数构造方法执行了");
    }
}
