package com.itheima.mpakcage;

public class PackageTest {
    /*
        导包: 如果要使用的类, 跟当前类, 不在同一个包中, 就需要编写导包代码

        细节: 如果自己编写的类, 跟Java已经写好的类, 重名了, 我们怎么区分使用
                - 使用全类名创建对象

        -----------------------------------------------------

        TODO: 包的划分, 后期做项目的时候, 还会做详细的介绍
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}

class Scanner {

}
