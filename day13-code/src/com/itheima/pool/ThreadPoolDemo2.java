package com.itheima.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    /*
        自定义线程池 :

            手动的创建 ThreadPoolExecutor

                参数1: 核心线程数量 (正式员工)
                参数2: 最大线程数量 (正式员工 + 临时工)
                参数3: 空闲时间
                参数4: 时间单位
                参数5: 任务队列 (排队)
                                new ArrayBlockingQueue<>() : 有界队列
                                new LinkedBlockingDeque() :  无界队列
                                            细节: 表面看起来是无界队列, 实际上也会对排队的数量做控制 (最大是int的最大取值范围)
                参数6: 线程对象的工厂
                参数7: 任务的拒绝策略
     */
    public static void main(String[] args) {

        // 1. 创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,          // 取用户访问量的平均值
                5,      // 高峰值 * 1.5
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),       // 最大线程数量 * 2
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );


        // 2. 提交线程任务
        for (int i = 1; i <= 16; i++) {
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "提交了线程任务");
            });
        }

    }
}
