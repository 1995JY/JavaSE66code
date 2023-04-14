package com.itheima.thread;

public class RunableDemo02 {
    public static void main(String[] args) {
        RunableThread rt=new RunableThread();
        Thread t=new Thread(rt);
        t.setName("线程A：");
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行了-----"+i);
        }
    }
}
class RunableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"线程执行了-----"+i);
        }
    }
}