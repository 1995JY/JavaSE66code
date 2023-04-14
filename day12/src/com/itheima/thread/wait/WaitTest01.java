package com.itheima.thread.wait;

public class WaitTest01 {
    public static void main(String[] args) {
        printer p=new printer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (printer.class) {
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
                while(true){
                    synchronized (printer.class) {
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
class printer{
    int flag=1;
    public  void print1() throws InterruptedException {
        if(flag!=1){
            printer.class.wait();
        }
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
        flag=2;
        printer.class.notify();

    }
    public void print2() throws InterruptedException {
        if(flag!=2){
            printer.class.wait();
        }
        System.out.print("传");
        System.out.print("智");
        System.out.print("教");
        System.out.print("育");
        System.out.println();
        flag=1;
        printer.class.notify();
    }
}
