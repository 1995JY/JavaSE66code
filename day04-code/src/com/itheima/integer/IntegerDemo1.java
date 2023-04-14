package com.itheima.integer;

public class IntegerDemo1 {
    /*
            手动装箱: 手动的将基本数据类型 int, 包装为引用数据类型的 Integer

                            Integer i = Integer.valueOf(10);

            自动装箱: 基本数据类型, 可以直接赋值给引用数据类型的包装类

            ----------------------------------------------------------------

            手动拆箱: 手动的调用Integer类中的intValue方法, 将其转换为基本数据类型

                            Integer i = 10;
                            int num = i.intValue();
                            System.out.println(num + 100);

            自动拆箱: 引用数据类型包装类, 可以和基本数据类型直接做运算了

            -------------------------------------------------------------------------

            结论: 引用数据类型的包装类, 和基本数据类型, 可以直接做运算, 不需要手动转换.
     */
    public static void main(String[] args) {

    }
}
