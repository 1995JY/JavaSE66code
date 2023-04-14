package com.itheima.inner_class;

public class Test4 {
    /*
        匿名内部类 : 本质来说, 就是一个特殊的局部内部类 (编写位置在方法中)
                    - 可以将继承一个类 \ 实现一个接口,  方法重写,  创建对象,  这三步合成一步完成.

        格式:
                new 类名() {}   ---> 继承这个类
                new 接口名() {}  ---> 实现这个接口

        前提:
                要有类, 或者是接口

        情况:
                当我们调用一个方法的时候, 发现方法的形参是一个接口
                        1. 编写实现类实现接口
                        2. 重写方法
                        3. 创建实现类对象


     */
    public static void main(String[] args) {

        // 方法的形参: 接口类型
        // 方法的实参: 该接口的实现类对象
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类重写后的show方法");
            }
        });


        useInter(() -> {System.out.println("我是Lambda重写后的show方法");});


    }

    /*
         Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类重写后的show方法");
            }
        }
     */
    public static void useInter(Inter i) {
        i.show();
    }

}

interface Inter {
    void show();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("我是实现类重写后的show方法...");
    }
}