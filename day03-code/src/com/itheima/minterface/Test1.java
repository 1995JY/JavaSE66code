package com.itheima.minterface;

public class Test1 {
    /*
        JDK8版本开始

                A. 接口中允许编写带有方法体的默认方法了
                    - 价值: 解决接口的升级问题 (打补丁)

                    - 注意事项: 如果类实现了多个接口, 多个接口中存在相同的默认方法, 作为实现类, 需要强制重写默认方法
                                - 避免逻辑冲突问题.


     */
    public static void main(String[] args) {
        InterImplA a = new InterImplA();
        a.showC();
        a.showD();
    }
}

interface A {
    public default void show() {
        System.out.println("show...A");
    }
}

interface B {
    public default void show() {
        System.out.println("Show...B");
    }
}

class C extends Object implements A, B {

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}


/*
    项目1.0版本的代码...
    ------------------------
    项目升级到2.0版本, 需要丰富2个新的功能.
    - 情况: 想要对接口中的功能进行丰富, 还不想改动实现类中的代码
    - 解决: 使用JDK8版本之后, 接口的新特性, 内部允许编写方法体.
 */
interface Inter {
    void showA();

    void showB();

    public default void showC() {
        System.out.println("ShowC....");
    }

    public default void showD() {
        System.out.println("ShowD....");
    }

}

class InterImplA implements Inter {

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }
}

class InterImplB implements Inter {

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }
}