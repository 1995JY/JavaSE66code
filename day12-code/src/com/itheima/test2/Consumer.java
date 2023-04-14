package com.itheima.test2;

public class Consumer implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Box.class) {
                if (Box.flag == false) {
                    // 没有包子: 消费者线程等待
                    try {
                        Box.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    // 有包子: 开吃
                    System.out.println("消费者吃包子");
                    Box.flag = false;
                    // 唤醒生产者线程
                    Box.class.notify();
                }
            }
        }
    }
}
