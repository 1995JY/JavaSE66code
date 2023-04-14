package com.itheima.homework;
/*
需求 : 请定义数组工具类, 编写两个方法

* 冒泡排序
* 二分查找
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr1={12,5,8,9,65,45,74,1,58,62,99};
        arrays.bubbleSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
        System.out.println();
        int[] arr2={1,5,8,9,12,45,58,62,65,74,99};
        System.out.println(arrays.binarySearch(arr2, 10));


    }
}
class arrays{
    private arrays() {
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    static int binarySearch(int[] arr,int num){
        int min=0;
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(num>arr[mid]){
                min=mid+1;
            }else if(num<arr[mid]){
                max=mid-1;
            }else{
                return mid;
            }
        }

       return -1;
    }
}
