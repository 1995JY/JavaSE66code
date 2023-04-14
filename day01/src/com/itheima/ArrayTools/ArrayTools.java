package com.itheima.ArrayTools;

/**
 * 操作数组的一系列方法
 * author 翁进银
 */
public class ArrayTools {
    private ArrayTools() {
    }

    /**
     * getmax方法，是获取数组中的最大值，并返回
     * @param arr
     * @return
     */
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    /**
     * getMin方法，调用该方法获取数组中的最小值并返回
     * @param arr
     * @return
     */
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    /**
     * 将传入的数组进行排序。
     * @param arr
     */
     public static void sort(int[] arr){
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
}
