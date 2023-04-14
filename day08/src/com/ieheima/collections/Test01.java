package com.ieheima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"b","a","d","c","f","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list02=new ArrayList<>();
        Collections.addAll(list02,555,444,222,111,333);
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);
        Collections.sort(list02, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list02);


    }

}
