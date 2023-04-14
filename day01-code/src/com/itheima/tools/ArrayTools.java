package com.itheima.tools;

/*
    工具类 : 自己独立存在没有意义, 为了其他类提供服务的类
                - 内部的方法, 常被static所修饰, 为了调用方便
                - 通常会私有构造方法 (不让其他类, 来创建本类对象)
 */


/**
 * 这个类是数组的工具类, 内部提供了很多便于操作数组的方法
 * @author haoys
 */
public class ArrayTools {

    public ArrayTools() {

    }

    /**
     * 此方法从数组中获取最大值
     * @param arr 接收要操作的数组
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 此方法从数组中找最小值
     * @param arr   接收的数组
     * @return 返回数组中的最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 此方法用于遍历打印数组, 格式为 [a, b, c]
     * @param arr 接收到的数组
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

}
