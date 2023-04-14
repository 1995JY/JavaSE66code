package com.itheima.inner_class;

public class Test01 {
    public static void main(String[] args) {
        outer.inner o1=new outer().new inner();

    }
}
class outer{
    private int num=10;
    class inner{
      private int num2=20;
        public void show(){
            System.out.println("内部类");
        }
        public void print(){
            System.out.println(num);
        }

    }
    public void method(){
        inner i=new inner();
        i.show();
    }
}
