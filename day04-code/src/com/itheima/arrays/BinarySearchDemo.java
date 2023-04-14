package com.itheima.arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};

        int num = 200;

        int index = myBinarySearch(arr, num);

        System.out.println(index);

    }

    private static int myBinarySearch(int[] arr, int num) {
        // 1. 定义两个变量, 记录最小索引和最大索引
        int min = 0;
        int max = arr.length - 1;
        // 2. 编写循环的条件(折半的条件)
        while (min <= max) {
            // 3. 计算中间值
            int mid = (min + max) / 2;
            // 4. 比对
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                // 5. 找到了, 返回正确的索引
                return mid;
            }
        }

        // 6. 如果循环结束, 代码执行到了这里, 就说明没找到
        return -1;
    }

}
