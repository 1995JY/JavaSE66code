package com.itheima.algorithm;

public class BinarySerach {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        int index=myBinarySerach(arr,200);
        System.out.println(index);
    }

    private static int myBinarySerach(int[] arr, int num) {
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
