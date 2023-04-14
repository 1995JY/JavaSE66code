package com.itheima.test1;

public class ThreadTest2 {
    /*
        线程的通讯(等待唤醒机制)

                1. notify() : 随机唤醒单个线程
                2. notifyAll() : 唤醒所有等待的线程
                3. wait() : 在哪里等待, 就在哪里醒来
     */
    public static void main(String[] args) {
        MyPrinter p = new MyPrinter();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (MyPrinter.class) {
                        try {
                            p.print1();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (MyPrinter.class) {
                        try {
                            p.print2();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (MyPrinter.class) {
                        try {
                            p.print3();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}

class MyPrinter {
    int flag = 1;

    public void print1() throws InterruptedException {
        while (flag != 1) {
            MyPrinter.class.wait();
        }
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
        flag = 2;
        MyPrinter.class.notifyAll();
    }

    public void print2() throws InterruptedException {
        while (flag != 2) {
            MyPrinter.class.wait();
        }
        System.out.print("传");
        System.out.print("智");
        System.out.print("教");
        System.out.print("育");
        System.out.println();
        flag = 3;
        MyPrinter.class.notifyAll();
    }

    public void print3() throws InterruptedException {
        while (flag != 3) {
            MyPrinter.class.wait();
        }
        System.out.print("明");
        System.out.print("天");
        System.out.print("放");
        System.out.print("假");
        System.out.println();
        flag = 1;
        MyPrinter.class.notifyAll();
    }
}
