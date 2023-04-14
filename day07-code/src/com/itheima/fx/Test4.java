package com.itheima.fx;

import java.util.ArrayList;

public class Test4 {
    /*
        泛型接口:
                1. 实现类实现接口的时候, 指定具体类型
                2. 将自己的实现类, 加入泛型
     */
    public static void main(String[] args) {

        InterImpl<String> ii = new InterImpl<>();

    }
}

interface Inter<E> {
    void show(E e);
}

class InterImpl<E> implements Inter<E>{

    @Override
    public void show(E e) {

    }
}
