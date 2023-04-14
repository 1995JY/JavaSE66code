package com.itheima.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo2 {
    /*
        异常的体系结构 :

            Throwable :

                    Error : 系统级别错误, 修改代码也无法解决
                                - 内存崩溃
                    Exception : 我们程序员写代码的时候, 可能会遇到的问题, 修改代码是可以解决的

                                1. RuntimeException(还有它的子类) : 运行时异常

                                        - 编译没问题, 运行出错了

                                2. !RuntimeException : 编译时异常 (受检异常)

                                        - 代码语法没问题, 但是编译就是过不去

                                                sdf.parse(s);
                                                FileReader fr = new FileReader("D:\\abc.txt");

                                                编译期检测到这段代码可能会出现异常, 需要程序员给出[预处理方案]
                                                就算异常产生, 程序也知道如何面对.

     */
    public static void main(String[] args) throws ParseException, FileNotFoundException {

    }
}
