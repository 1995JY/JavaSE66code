package com.itheima.inner_class;

public class Test1 {
    /*
        内部类: 在一个类中, 继续编写类

        内部类创建对象的格式 :

                外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
     */
    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();
        oi.show();

    }
}

class Outer {

    private int num = 10;

    class Inner {
        public void show() {
            System.out.println("Inner...show...");
        }

        public void print() {
            // 访问Outer这个外部类中的成员 : 内部类访问外部类成员可以直接访问(包括私有)
            System.out.println(num);
        }
    }

    public void method() {
        // 外部类访问内部类的成员 : 需要创建对象访问
        Inner i = new Inner();
        i.show();
    }

}
