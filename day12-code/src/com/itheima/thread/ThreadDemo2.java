package com.itheima.thread;

public class ThreadDemo2 {
    /*
        开启线程的第二种方式 : 实现Runnable接口

            1. 找一个类实现Runnable接口
            2. 重写run方法
            3. 将线程要执行的任务, 写在run方法中
            4. 创建线程任务对象
            5. 创建线程对象(Thread), 将[线程任务]对象, 传递给[线程]对象
            6. 调用线程对象的start方法开启线程
     */
    public static void main(String[] args) {
        // 4. 创建线程任务对象
        MyRunnable mr = new MyRunnable();
        // 5. 创建线程对象(Thread), 将[线程任务]对象, 传递给[线程]对象
        Thread t = new Thread(mr, "线程A: ");
        // 6. 调用线程对象的start方法开启线程
        t.start();

        for (int i = 1; i <= 2000; i++) {
            System.out.println(Thread.currentThread().getName() + "-------------------" + i);
        }
    }
}

// 1. 找一个类实现Runnable接口
class MyRunnable implements Runnable {
    //2. 重写run方法
    @Override
    public void run() {
        // 3. 将线程要执行的任务, 写在run方法中
        for (int i = 1; i <= 2000; i++) {
            // Thread.currentThread() : 获取当前正在执行的线程对象
            // .getName() : 通过线程对象获取线程名
            System.out.println(Thread.currentThread().getName() + "打印" + i);
        }
    }
}