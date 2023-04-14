package com.itheima.this_super;

public class Test2 {
    /*
        super.父类成员的时候 (成员变量, 成员方法) :

                子父类中, 没有重名的成员变量, 也不涉及方法重写的情况, super.可以省略
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}

class Fu {
    int num = 10;

    public void show(){
        System.out.println("Fu...show");
    }
}

class Zi extends Fu {
    public void method(){
        System.out.println(num);
        show();
    }
}
