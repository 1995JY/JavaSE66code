package com.itheima.thread;

public class SleepThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            // 项目经理要求此处运行缓慢, 让甲方加钱优化
            Thread.sleep(1000);
        }
    }
}
