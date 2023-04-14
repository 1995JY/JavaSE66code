package com.itheima.minterface;

import com.itheima.a.MyInter;

public class InterfaceDemo2 {
    /*
        接口的成员特点 :

             1. 成员变量
                        接口中的变量, 只能是常量, 因为默认会加入三个关键字
                            public static final

             2. 成员方法
                        只能是抽象方法 (jdk8版本之前)
                           因为会默认加入两个关键字 public abstract

             3. 构造方法
                        没有
     */
    public static void main(String[] args) {

    }
}

class MyInterImpl implements MyInter {

    public MyInterImpl(){
        super();
    }

    @Override
    public void show() {

    }
}

