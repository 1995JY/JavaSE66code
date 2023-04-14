package com.itheima.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class A {
    /*
        方法的调用   A.method(s);
        方法的引用   A::method

        方法引用符号 ::

        -----------------------------------------

        方法的参数呢?

        - 可推导, 可省略原则

        -----------------------------------------

        引用静态的方法 :  类名::方法名
        引用非静态的方法 :  对象名::方法名
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a","b","c","d","e");

        A a = new A();

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(System.out::println);

        list.forEach(a::method);
    }

    public void method(String s){
        System.out.println(s.toUpperCase());
    }
}
