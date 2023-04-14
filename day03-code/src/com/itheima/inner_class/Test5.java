package com.itheima.inner_class;

import javax.swing.*;

public class Test5 {
    public static void main(String[] args) {
        // 1. 创建窗体对象
        JFrame frame = new JFrame();
        // 2. 设置窗体的摆放位置和大小
        frame.setBounds(100,100,500,500);
        // 3. 创建按钮对象
        JButton btn = new JButton("按钮");
        // 4. 将按钮添加到窗体中
        frame.getContentPane().add(btn);

        // 5. 为按钮绑定监听(监视)
        // 情况: 我调用一个方法, 人家的方法形参是接口, 我该传入的是该接口的实现类对象.
        // 1. 单独编写一个实现类
        // 2. 传入匿名内部类 (接口中的抽象方法很少 1~2 )
        btn.addMouseListener(new MouseListenerImpl());

        frame.setVisible(true);
    }
}


