package com.itheima.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    /*
        JDK自带的线程池

                Executors 的静态方法 :

                       public static ExecutorService newCachedThreadPool() : 创建一个默认的线程池
                       public static newFixedThreadPool ( int nThreads ) : 创建一个指定最多线程数量的线程池

                看效果: 线程对象被复用了
                       
     */
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "--- 提交了线程任务");
                }
            });
        }

    }

    private static void method() {
        // 1. 获取线程池
        ExecutorService service = Executors.newCachedThreadPool();

        // 2. 向线程池提交任务
        for (int i = 1; i <= 100; i++) {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "提交了线程任务");
                }
            });
        }

        // service.shutdown();
    }
}
