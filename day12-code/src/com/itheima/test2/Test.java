package com.itheima.test2;

public class Test {
    public static void main(String[] args) {

        new Thread(new Maker()).start();
        new Thread(new Consumer()).start();

    }
}
