package com.itheima.test;

import java.util.Objects;

public class IntegerTest {
    /*
        装箱的范围在 -128 ~ 127 之间, == 号比较出来的结果就是 true
                - 反之就是 false.

        public static Integer valueOf(int i) {
            if (i >= -128 && i <= 127) {
                return IntegerCache.cache[索引];  ---> 不会创建新的对象, 都是从底层数组中, 取出一个已有的对象, 返回给你.
                return IntegerCache.cache[i + (-IntegerCache.low)];
            } else {
                return new Integer(i);
            }
        }

        ------------------------------------------------------------------

        如果装箱的数据, 不在byte取值范围内, 会重新 new 一个对象再返回
            - 如果在byte的取值范围内, 会从底层数组中, 取出一个已有的对象进行返回
     */
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);       // true
        System.out.println(i1.equals(i2));  // true

        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println(i3 == i4);       // false

        System.out.println(Objects.equals(i3, i4)); // true

    }
}
