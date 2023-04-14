package com.itheima.integer;

public class IntergerDemo {
    public static void main(String[] args) {
        Integer i=10;
        Integer i1=127;
        Integer i2=127;
        System.out.println(i1==i2);
        Integer i3=129;
        Integer i4=129;
        System.out.println(i3==i4);

        Long l1=127L;
        Long l2=127L;
        System.out.println(l1==l2);
        Long l3=129L;
        Long l4=129L;
        System.out.println(l3==l4);
    }
}
