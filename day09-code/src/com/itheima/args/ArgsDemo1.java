package com.itheima.args;



public class ArgsDemo1 {
    /*
        可变参数: 本质来讲就是一个数组
                    作用: 调用方法的时候, 实际参数可以灵活的传入(空着, 1个, 2个, 多个...)

        注意事项:
                1. 格式必须是 数据类型...
                2. 如果方法中设计了可变参数的同时, 还有其他参数, 可变参数一定要放在最后

        学习目标:
                1. 能够自己设计可变参数的方法
                2. 如果使用别人的方法, 参数是可变参数, 知道如何调用.
     */
    public static void main(String[] args) {

        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1, 2, 3, 4));

    }

    public static int getSum(int... a) {

        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;

    }

}
