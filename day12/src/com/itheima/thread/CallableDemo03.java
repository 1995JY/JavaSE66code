package com.itheima.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread ct=new CallableThread();
        FutureTask<Integer> ft=new FutureTask<>(ct);
        Thread t=new Thread(ft);
        t.setName("线程B");
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程在执行"+"---------"+i);
        }
        System.out.println(ft.get());
    }

}
class CallableThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 1000; i++) {
            sum+=i;
            System.out.println(Thread.currentThread().getName()+"线程在执行"+"--------"+sum);
        }
        return sum;
    }
}
