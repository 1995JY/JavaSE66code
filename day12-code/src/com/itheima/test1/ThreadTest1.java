package com.itheima.test1;

public class ThreadTest1 {
    /*
        线程的通讯(等待唤醒机制)
     */
    public static void main(String[] args) {
        Printer p = new Printer();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (Printer.class) {
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
                    synchronized (Printer.class) {
                        try {
                            p.print2();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}

class Printer {
    int flag = 1;
    public void print1() throws InterruptedException {
        if(flag != 1){
            Printer.class.wait();
        }
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
        flag = 2;
        Printer.class.notify();
    }

    public void print2() throws InterruptedException {
        if(flag != 2){
            Printer.class.wait();
        }
        System.out.print("传");
        System.out.print("智");
        System.out.print("教");
        System.out.print("育");
        System.out.println();
        flag = 1;
        Printer.class.notify();
    }
}
