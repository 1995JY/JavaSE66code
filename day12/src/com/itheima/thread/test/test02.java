package com.itheima.thread.test;

public class test02 {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();
        t1.setName("窗口A：");
        t2.setName("窗口B：");
        t3.setName("窗口C：");
        t1.start();
        t2.start();
        t3.start();
    }

}
class Ticket extends Thread{
    static int num=100;

    @Override
    public void run() {
        while(true){
            if(num<1){
                break;
            }else{
                System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张票");
                num--;
            }

        }
    }
}
