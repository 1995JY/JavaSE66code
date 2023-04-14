package com.itheima.exer;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("ddd");
        list.add("123");
        list.add("hahah");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if("ddd".equals(it.next())){
                list.remove(it.next());
            }
        }

    }
}
