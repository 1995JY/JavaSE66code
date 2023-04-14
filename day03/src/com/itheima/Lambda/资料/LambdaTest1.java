package com.itheima.Lambda.资料;

public class LambdaTest1 {
    public static void main(String[] args) {
        //调用方法，使用匿名内部类的方法
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("这是匿名内部类重写后的show方法");
            }
        });
        //使用lambda表达式调用方法
        useShowHandler(()->{ System.out.println("这是lambda表达式重写后的show方法");});

    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

interface ShowHandler {
    void show();
}