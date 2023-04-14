package com.itheima.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    /*
        BigDecimal的介绍 : 解决小数运算出现的不精确问题

        学习路径:
                1. 将需要运算的数据, 封装到BigDecimal对象中
                2. 使用BigDecimal对象, 完成数据运算, 保证精确

        BigDecimal的构造方法 :

                public BigDecimal(double val) :  不推荐!!!
                ------------------------------------------------------

                public BigDecimal(String val) :  推荐
                BigDecimal.valueOf(0.1);      :  推荐

        BigDecimal的常用成员方法 :


                1. 加
                        public BigDecimal add(BigDecimal augend) :
                2. 减
                        public BigDecimal subtract(BigDecimal subtrahend) :
                3. 乘
                        public BigDecimal multiply(BigDecimal multiplicand) :
                4. 除
                        public BigDecimal divide(BigDecimal divisor) :
     */
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);

        // 两个对象做加法运算, 将运算后的结果转换为double类型
        double result = bd1.add(bd2).doubleValue();
        System.out.println(result);

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));
    }
}
