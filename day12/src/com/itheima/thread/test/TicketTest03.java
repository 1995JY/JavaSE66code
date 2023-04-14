package com.itheima.thread.test;

public class TicketTest03 {
    public static void main(String[] args) {
        myRunable m=new myRunable();
        Thread t1=new Thread(m,"窗口A：");
        Thread t2=new Thread(m,"窗口B：");
        Thread t3=new Thread(m,"窗口C：");
        t1.start();
        t2.start();
        t3.start();

    }
}
class myRunable implements Runnable{
    int tickets=1000;

    @Override
    public void run() {
        while(true){
            synchronized (myRunable.class){
                if(tickets<1){
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName()+"售出了第"+tickets+"张票");
                    tickets--;
                }
            }
    }
}
}

