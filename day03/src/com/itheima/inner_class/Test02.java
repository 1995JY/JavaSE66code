package com.itheima.inner_class;

public class Test02 {
    public static void main(String[] args) {
        InnerIpml i=new InnerIpml();
        useInner(i);
        i.show();
//        匿名内部类
        useInner(new Inner(){

            @Override
            public void show() {
                System.out.println("这是匿名内部类重写后的show方法---");
            }
        });

    }
    public static void useInner(Inner a){
        a.show();
    }
}
interface Inner{
    void show();
}
class InnerIpml implements Inner{

    @Override
    public void show() {
        System.out.println("我是实现类后重写的方法。。。。");
    }
}
