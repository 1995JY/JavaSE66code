package com.itheima.thread.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AddNumber an=new AddNumber();
        FutureTask<Integer> task1=new FutureTask<>(an);
        FutureTask<Integer> task2=new FutureTask<>(an);
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.setName("线程A：");
        t2.setName("线程B：");
        t1.start();
        t2.start();
        System.out.println(t1.getName()+"计算总和为："+task1.get());
        System.out.println(t2.getName()+"计算总和为："+task2.get());


    }
}
class AddNumber implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
