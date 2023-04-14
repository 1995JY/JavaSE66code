package com.itheima.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    /*
        开启线程的第三种方式 : 实现Callable接口
            - 特点: 线程任务执行完毕后, 是可以有结果返回的
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3. 创建线程任务对象
        MyCallable mc = new MyCallable();
        // 4. 将MyCallable, 进一步封装, 封装为线程对象能够识别的线程任务
        FutureTask<Integer> task = new FutureTask<>(mc);
        // 5. 创建线程对象, 将封装好的线程任务, 传入构造方法
        Thread t = new Thread(task, "线程A: ");
        // 6. 调用start方法开启线程
        t.start();

        for(int i = 1; i <= 2000; i++){
            System.out.println("main主线程打印数组-------------------" + i);
        }

        // 7. 通过线程任务对象, 获取结果
        // 注意: get方法具有阻塞效果
        Integer result = task.get();
        System.out.println(result);


    }
}

// 1. 找一个类实现Callable, 泛型: 运算后的结果类型
class MyCallable implements Callable<Integer> {

    // 2. 重写call方法, 将线程任务写在call方法中
    @Override
    public Integer call() throws Exception {

        int sum = 0;
        for(int i = 1; i <= 2000; i++){
            sum += i;
            System.out.println(Thread.currentThread().getName() +  "正在累加求和:" + sum);
        }

        return sum;
    }
}
