package com.itheima.set.hashset;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("b");
        hs.add("a");
        hs.add("c");
        hs.add("e");
        hs.add("d");
        hs.add("d");
        hs.add("d");
        hs.add("d");

        System.out.println(hs);

    }
}
