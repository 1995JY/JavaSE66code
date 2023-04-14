package com.itheima.test1;

public class TicketTest2 {
    /*
        同步方法: 在方法的返回值类型前面, 加入synchronized
                    - 这个方法中所有的代码, 都被同步(上锁), 当方法执行完毕, 所才会被释放

        问题: 同步方法的锁对象是什么?

                    1. 非静态方法 : this
                    2. 静态方法 : 类名.class
     */
    public static void main(String[] args) {

        MyTicket m = new MyTicket();

        new Thread(m, "窗口A: ").start();
        new Thread(m, "窗口B: ").start();

    }
}

class MyTicket implements Runnable {

    static int tickets = 500;

    @Override
    public void run() {
        while (true) {

            String name = Thread.currentThread().getName();

            if ("窗口A: ".equals(name)) {
                // 调用同步方法
                if(method()){
                    break;
                }
            } else if ("窗口B: ".equals(name)) {
                // 手动编写同步代码块, 加入this作为锁对象
                synchronized (MyTicket.class) {
                    if(tickets <= 0){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                    tickets--;
                }
            }

        }
    }

    private static synchronized boolean method() {
        if (tickets <= 0) {
            return true;
        }
        System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
        tickets--;
        return false;
    }
}
