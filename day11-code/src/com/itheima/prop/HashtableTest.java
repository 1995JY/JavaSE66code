package com.itheima.prop;

import java.util.Hashtable;

public class HashtableTest {
    /*
        HashMap和Hashtable的区别

            1. HashMap是jdk1.2版本出现的  Hashtable是jdk1.0版本出现的

            2. HashMap允许存储null键null值, Hashtable不允许存储null键null值

            3.
                    HashMap是线程不安全的, 效率高
                    Hashtable是线程安全的, 效率低
     */
    public static void main(String[] args) {

        Hashtable<String, String> hm = new Hashtable<>();

        hm.put(null, null);

        System.out.println(hm);

    }
}
