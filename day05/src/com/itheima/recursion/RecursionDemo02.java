package com.itheima.recursion;
/*
斐波那契数列
1 1 2 3 5 8 13 21
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(get(50));
    }
    static long get(int num){
        if(num==1||num==2){
            return 1;
        }else if(num==0){
           return 0;
        } else{
            return get(num-1)+get(num-2);
        }
    }
}
