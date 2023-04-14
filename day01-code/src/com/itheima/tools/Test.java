package com.itheima.tools;

public class Test {
    public static void main(String[] args) {


        int[] arr = {11, 22, 33, 44, 55};

        System.out.println(ArrayTools.getMax(arr));
        System.out.println(ArrayTools.getMin(arr));
        ArrayTools.printArray(arr);

        Test t = new Test();
        t.method();

    }

    public void method(){

    }
}
