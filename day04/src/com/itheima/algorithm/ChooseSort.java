package com.itheima.algorithm;

import java.util.Arrays;

public class ChooseSort {
    public static void main(String[] args) {
        int[] arr={33,5,4,9,654,21,24,7,36};
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
