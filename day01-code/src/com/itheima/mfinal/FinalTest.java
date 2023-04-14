package com.itheima.mfinal;

public class FinalTest {
    /*
        final修饰方法 : 不能被重写
        final修饰的类 : 不能被继承
                        - 如果一个类中, 所有的方法, 都不希望被子类重写, 就不要有子类了.
        final修饰的变量 : 就变成了常量, 只能被赋值一次
                        - 常量 : 自定义常量(被final修饰的变量)
                        - 常量(字面值常量) : 基础班讲的

                        -----------------------------------------

                            1. 基本数据类型: 数据值不可改变
                            2. 引用数据类型: 地址值不可改变

                        -----------------------------------------

                            final修饰成员变量的初始化时机 (赋值的实际)
                                    1. 在创建的时候直接赋值 (推荐)
                                    2. 在构造方法结束之前完成赋值
     */
    public static void main(String[] args) {
        final int[] ARR = {11, 22, 33};
        // arr = new int[]{44, 55, 66};

        System.out.println(ARR[0]);
    }
}

class Student {
    final int NUM;

    public Student(){
        NUM = 10;
    }
}

final class Fu extends Object {
    public void show() {
        System.out.println("我是Fu类中, 非常重要的一段逻辑, 不希望子类发生修改");
    }

    public void method() {
        System.out.println("method...");
    }

    public void print() {
        System.out.println("print...");
    }

}

class Zi  /* extends Fu */ {

}
