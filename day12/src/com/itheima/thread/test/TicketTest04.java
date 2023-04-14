package com.itheima.thread.test;

import java.util.concurrent.locks.ReentrantLock;

public class TicketTest04 {
    public static void main(String[] args) {
        myRunable02 m = new myRunable02();
        new Thread(m, "窗口A").start();

    }

}

class myRunable02 implements Runnable {
    int tickets = 1000;
    ReentrantLock r = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            r.lock();
            try {
                if (tickets < 1) {
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "售出了第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                r.unlock();
            }
        }
    }
}