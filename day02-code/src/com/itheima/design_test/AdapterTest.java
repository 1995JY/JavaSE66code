package com.itheima.design_test;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdapterTest {
    /*
        设计模式: 前人总结出来一些解决问题的经验.

        --------------------------------------------------------

        1. 适配器设计模式 : 可以解决类实现接口, 但是只需要部分方法的问题.

                A: 找一个适配器类(中间类), 实现接口, 重写所有方法, 对于方法的实现都是空实现
                B: 将适配器类改写为抽象类, 为了不让其他类创建对象
                C: 让自己的类, 继承适配器类, 重写自己需要的方法即可.
     */
    public static void main(String[] args) {
        鲁智深 l = new 鲁智深();
        l.习武();
    }
}

interface 和尚 {
    void 打坐();

    void 撞钟();

    void 念经();

    void 习武();
}

abstract class 和尚Adapter implements 和尚 {

    @Override
    public void 打坐() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 习武() {

    }
}

class 唐僧 extends 和尚Adapter {
    @Override
    public void 打坐() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 念经() {

    }
}

class 鲁智深 extends 和尚Adapter {
    @Override
    public void 习武() {
        System.out.println("倒拔垂杨柳");
        System.out.println("拳打镇关西");
        System.out.println("大闹野猪林");
        System.out.println("黑马学Java");
    }
}