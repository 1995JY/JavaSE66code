package com.itheima.test;

public class IntegerTest2 {
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        // 1. 根据逗号切割字符串
        String[] sArr = s.split(",");

        // 2. 将字符串数组中的数据, 转换为整数类型
        int[] arr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }

        // 3. 求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值为:" + max);
    }
}
