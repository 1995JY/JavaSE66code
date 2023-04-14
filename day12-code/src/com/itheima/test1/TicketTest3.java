package com.itheima.test1;

import java.util.concurrent.locks.ReentrantLock;

public class TicketTest3 {
    public static void main(String[] args) {

        ThreadTask task = new ThreadTask();

        new Thread(task, "窗口A: ").start();
        new Thread(task, "窗口B: ").start();

    }
}

class ThreadTask implements Runnable {

    int tickets = 500;

    // 创建锁对象
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第:" + tickets + "号票");
                tickets--;
            } finally {
                lock.unlock();
            }
        }
    }
}
