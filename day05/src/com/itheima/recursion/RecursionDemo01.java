package com.itheima.recursion;

public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(jc(5));
        System.out.println(multiply(5));
    }
    static long jc(int num){
        if(num==1){
            return 1;
        }
        else{
            return num*jc(num-1);
        }
    }
    static long multiply(int num){
        int result=1;
        for (int i = num; i >0; i--) {
            result*=i;
        }
        return result;
    }
}
