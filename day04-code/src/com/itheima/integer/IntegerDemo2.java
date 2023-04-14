package com.itheima.integer;

public class IntegerDemo2 {
    /*
        字符串和基本数据类型的转换 :

                字符串 ---> 基本数据类型

                            Integer.parseInt("123");
                            Double.parseDouble("12.3");
                            Long.parseLong("123");
                            ...

                            所有的包装类, 只有Character不存在parseXxx方法.

                基本数据类型 ---> 字符串

                            System.out.println(10 + "");
                            System.out.println(12.3 + "");

     */
    public static void main(String[] args) {
        String num = "123";
        int i = Integer.parseInt(num);
        System.out.println(i + 100);
    }
}
