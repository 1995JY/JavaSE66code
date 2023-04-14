package com.itheima.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("myThread线程在执行第: "+i+"  次");
        }
    }
}
