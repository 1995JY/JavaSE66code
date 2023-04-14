package com.itheima.lambda;

public class LambdaDemo {
    /*
        函数式接口: 有且仅有一个抽象方法的接口
        ----------------------------------------------------------

        Lambda表达式: JDK8版本之后出现的一种新的语法, 可以进一步的简化匿名内部类的书写.
                        - 注意: 只能够简化函数式接口的匿名内部类.
     */
    public static void main(String[] args) {

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("show...");
            }

            @Override
            public void print() {
                System.out.println("print...");
            }
        });

    }

    public static void useInter(Inter i) {
        i.show();
        i.print();
    }

}


interface Inter {
    void show();

    void print();
}
