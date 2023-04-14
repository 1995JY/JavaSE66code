package com.itheima.test2;

public class Maker implements Runnable {

    @Override
    public void run() {
        while(true){
            synchronized (Box.class) {
                if(Box.flag == false){
                    // 没有包子: 生产
                    System.out.println("生产者制作包子");
                    // 改变包子的状态
                    Box.flag = true;
                    // 有包子了, 通知消费者来吃
                    Box.class.notify();
                } else {
                    // 有包子: 等待
                    try {
                        Box.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
