package com.itheima.test1;

public class TicketTest1 {
    /*
        线程安全问题: 资源共享

        解决方案: 当CPU切换到某一条线程 (A线程)
                        - 正在执行代码逻辑的时候, CPU不要切换到其他线程去工作

                同步代码块 :

                          synchronized (锁对象) {
                               // 要执行的代码
                          }

                          锁对象 : 可以是任意对象, 多个线程的锁对象, 必须是同一把锁
     */
    public static void main(String[] args) {

        TicketTask t1 = new TicketTask();
        t1.setName("窗口A: ");

        TicketTask t2 = new TicketTask();
        t2.setName("窗口B: ");

        TicketTask t3 = new TicketTask();
        t3.setName("窗口C: ");

        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketTask extends Thread {

    static int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (TicketTask.class) {
                if (tickets <= 0) {
                    break;
                }
                System.out.println(getName() + "卖出了第" + tickets + "号票");
                tickets--;
            }
        }
    }

}
