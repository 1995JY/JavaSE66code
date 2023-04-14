package com.itheima.mextends;

public class ExtendsDemo2 {
    /*
        当子父类中, 出现了重名的成员变量, 非要用父类的成员, 可以使用super进行调用.

                this : 调用本类成员
                super : 调用父类成员
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    int num = 10;
}

class Zi extends Fu {
    int num = 20;

    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
