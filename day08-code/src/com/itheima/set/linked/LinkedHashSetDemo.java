package com.itheima.set.linked;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("b");
        lhs.add("c");
        lhs.add("a");
        lhs.add("e");
        lhs.add("d");
        lhs.add("d");
        lhs.add("d");
        lhs.add("d");

        System.out.println(lhs);
    }
}
