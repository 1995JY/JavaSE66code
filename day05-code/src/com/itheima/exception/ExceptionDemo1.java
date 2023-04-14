package com.itheima.exception;

import java.math.BigDecimal;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        method(arr);

    }

    public static void method(int[] arr){
        System.out.println(arr[0]);

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        bd1.divide(bd2);

    }
}
