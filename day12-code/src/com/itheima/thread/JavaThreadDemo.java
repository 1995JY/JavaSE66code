package com.itheima.thread;

public class JavaThreadDemo {
    /*
        Java程序默认就是多线程的
            1. 主线程  (正常执行逻辑, 可能会制造垃圾对象)
            2. 垃圾回收线程 (监控垃圾的数量, 清理垃圾对象)
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 500000; i++){
            new Demo();
        }
    }
}

class Demo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被清理了~~~~");
    }

}
