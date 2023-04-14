package com.itheima.thread.wait;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class WaitDemo02 {
    public static void main(String[] args) {
        mPrinter mp=new mPrinter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        mp.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        mp.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        mp.print3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
class mPrinter{

    ReentrantLock lock=new ReentrantLock();

    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    int flag=1;

    public  void print1() throws InterruptedException {
        lock.lock();
        if(flag!=1){
            c1.await();
        }
        System.out.print("黑");
        System.out.print("马");
        System.out.print("程");
        System.out.print("序");
        System.out.print("员");
        System.out.println();
        flag=2;
        c2.signal();
        lock.unlock();

    }
    public void print2() throws InterruptedException {
        lock.lock();
        if(flag!=2){
            c2.await();
        }

        System.out.print("传");
        System.out.print("智");
        System.out.print("教");
        System.out.print("育");
        System.out.println();
        flag=3;
        c3.signal();
        lock.unlock();
    }
    public void print3() throws InterruptedException {
        lock.lock();
        if(flag!=3){
            c3.await();
        }

        System.out.print("明");
        System.out.print("天");
        System.out.print("放");
        System.out.print("假");
        System.out.println();
        flag=1;
        c1.signal();
        lock.unlock();
    }
}
