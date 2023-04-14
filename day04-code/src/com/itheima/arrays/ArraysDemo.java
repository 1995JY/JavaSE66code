package com.itheima.arrays;

import java.util.Arrays;

public class ArraysDemo {
    /*
        Arrays数组工具类常用的方法 :

            public static String toString(类型[] a) : 将数组中的元素, 按照指定的格式, 拼接为字符串并返回

            public static boolean equals(类型[] a, 类型[] a2) :  两个数组做内容的比较

            public static int binarySearch(类型[] a, 元素) : 查找元素在数组中出现的索引位置 (二分查找法)
                                                                    - 只能操作排好序的数组 (正序)

            public static void sort(类型[] a) : 对数组进行升序排列
     */
    public static void main(String[] args) {

        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {55, 44, 33, 22, 11};

        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println(Arrays.binarySearch(arr1, 66));

        System.out.println(Arrays.binarySearch(arr2, 44));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
