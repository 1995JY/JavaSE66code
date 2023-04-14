package com.itheima.math;

public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.abs(-123));         // 获取参数的绝对值

        System.out.println(Math.ceil(12.3));        // 向上取整
        System.out.println(Math.ceil(12.9));

        System.out.println(Math.floor(12.3));       // 向下取整
        System.out.println(Math.floor(12.9));

        System.out.println(Math.round(12.3));       // 四舍五入
        System.out.println(Math.round(12.9));

        System.out.println(Math.max(10, 20));       // 获取最大值
        System.out.println(Math.min(10, 20));       // 获取最小值

        System.out.println(Math.pow(2, 3));         // 返回a的b次幂

        System.out.println(Math.random());
    }
}
