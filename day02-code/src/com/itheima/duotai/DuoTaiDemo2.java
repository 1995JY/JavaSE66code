package com.itheima.duotai;

public class DuoTaiDemo2 {
    /*
        多态创建对象之后, 调用成员的访问特点 :

            1. 成员变量 : 编译看左边(父类), 运行看左边(父类)
                            - 注意: 因为是父类的引用, 所以只能看到堆内存中, super那一小块空间.

            2. 成员方法 : 编译看左边(父类), 运行看右边(子类)
                            - 问题: 为什么运行的时候, 一定要执行子类的方法逻辑
                            - 回答: 因为父类的方法, 很有可能是一个抽象方法.

         ------------------------------------------------------------------------

            调用静态方法 :
                            - 静态的东西推荐使用类名调用
                            - 因为代码中就算写成对象名调用, 在编译的时候, 也会改成类名调用.

                                f.method();  ---> Fu.method();
     */
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);      // 10
        f.show();

        f.method();

    }
}

class Fu {
    int num = 10;

    public void show() {
        System.out.println("Fu...show");
    }

    public static void method(){
        System.out.println("Fu...static...method");
    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void show() {
        System.out.println("Zi...show");
    }

    public static void method(){
        System.out.println("Zi...static...method");
    }
}
