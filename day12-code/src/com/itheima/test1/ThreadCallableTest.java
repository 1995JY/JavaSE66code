package com.itheima.test1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest {
    /*
        请定义两个线程
            一个线程可以计算1--100所有数字的累加和
            另一个线程可以计算1--100所有数字的累加和
            每个线程计算完毕后各自打印计算结果

            格式例如："xxx线程计算1--100的累加和，结果：xxxx"

        请定义测试类，并定义main()方法，启动两个线程，观察控制台打印结果
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建线程任务对象
        GetSumTask sumTask = new GetSumTask();

        // 将线程任务进一步的封装
        FutureTask<Integer> task1 = new FutureTask<>(sumTask);
        FutureTask<Integer> task2 = new FutureTask<>(sumTask);

        Thread t1 = new Thread(task1, "线程A: ");
        Thread t2 = new Thread(task2, "线程B: ");

        t1.start();
        t2.start();

        // 获取线程执行后的结果
        System.out.println(t1.getName() + "线程计算1--100的累加和，结果：" + task1.get());
        System.out.println(t2.getName() + "线程计算1--100的累加和，结果：" + task2.get());


    }
}

class GetSumTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
