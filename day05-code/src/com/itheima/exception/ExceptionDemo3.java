package com.itheima.exception;

public class ExceptionDemo3 {
    /*
        异常的处理方式 :

            1. 自己能够解决, 自己处理
            2. 自己解决不了, 找上级处理 (抛出异常)

        -------------------------------------------------------

        Java程序遇到了异常, 默认的处理方案 :

            - 结论: 在出现异常的那一句代码, 把程序终止, 在控制台展示异常信息
     */
    public static void main(String[] args) {

        method();   // throw new ArithmeticException();  抛给JVM虚拟机

    }

    public static void method(){
        System.out.println("开始");
        System.out.println(10 / 0);     // throw new ArithmeticException();   抛给main方法
        System.out.println("结束");
    }
}
