package com.itheima.minterface;

public class InterfaceDemo1 {
    /*
        接口 : 就是规则进行声明
        ---------------------------------------------

        接口的使用场景: 当一个类中所有的方法, 全部都是抽象方法, 那么这个类的唯一价值就只是声明规则了
                        - 对于这种类, 我们通常会改写为Java中的接口

        接口的定义格式 :
                        public interface 接口名 {

                        }

        接口不允许实例化(不允许创建对象)
                        - 因为如果允许创建对象, 就可以调用内部没有方法体的抽象方法了, 这样做没有意义

        类实现接口 :
                        public class 类名 implements 接口名 {

                        }

        作为接口的实现类(子类) :

                        1. 实现所有抽象方法 (推荐)
                        2. 可以将实现类变成抽象类 (不推荐)
     */
    public static void main(String[] args) {
        InterABCImpl ii = new InterABCImpl();
        ii.show();
    }
}

interface Inter {
    public abstract void show();
    public abstract void print();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("我是实现类, 重写后的show方法");
    }

    @Override
    public void print() {
        System.out.println("我是实现类, 重写后的print方法");
    }
}