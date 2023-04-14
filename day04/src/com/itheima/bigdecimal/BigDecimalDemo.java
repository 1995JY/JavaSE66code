package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double num1=0.1;
        double num2=0.2;
        System.out.println(num1+num2);
        BigDecimal b1=new BigDecimal("0.4");
        BigDecimal b2=new BigDecimal("0.2");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2).doubleValue());
        System.out.println(b1.multiply(b2).doubleValue());
        System.out.println(b1.divide(b2));
        System.out.println(b1.divide(b2,6, RoundingMode.UP));
        System.out.println(b1.divide(b2,7, RoundingMode.DOWN));
        System.out.println(b1.divide(b2,8, RoundingMode.HALF_UP));


    }
}
