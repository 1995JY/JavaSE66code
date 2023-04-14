package com.itheima.thread;

public class ThreadDemo1 {
    /*
        开启线程的第一种方式 : 继承Thread类

            1. 找一个类继承Thread
            2. 重写run方法
            3. 将线程要执行的任务, 写在run方法中
            4. 创建线程对象
            5. 调用start方法开启线程

        重点: 只要调用start方法开启线程, 内部就会自动调用run方法.
        注意: 如果使用线程对象调用run方法, 没有开启新的线程, 只是调用了对象的一次方法而已

     */
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程A: ");
        mt1.start();

        MyThread mt2 = new MyThread("线程B: ");
        mt2.start();

        for(int i = 1; i <= 2000; i++){
            System.out.println("main主线程打印数组-------------------" + i);
        }
    }
}

// 1. 找一个类继承Thread
class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    // 2. 重写run方法
    @Override
    public void run() {
        // 3. 将线程要执行的任务, 写在run方法中
        for (int i = 1; i <= 2000; i++) {
            System.out.println(getName() + "MyThread线程打印数字" + i);
        }
    }
}
