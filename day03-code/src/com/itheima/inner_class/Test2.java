package com.itheima.inner_class;

public class Test2 {
    public static void main(String[] args) {
        MyOuter.Inner mi = new MyOuter().new Inner();
        mi.show();
    }
}

class MyOuter {
    int num = 150;

    class Inner {
        int num = 110;

        public void show() {
            int num = 78;
            System.out.println(num);                 // 78
            System.out.println(this.num);            // 110
            System.out.println(MyOuter.this.num);    // 150
        }
    }
}

