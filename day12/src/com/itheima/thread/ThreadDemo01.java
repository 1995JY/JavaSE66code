package com.itheima.thread;

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main方法主线程在执行第"+i+"次");
        }
    }
}
