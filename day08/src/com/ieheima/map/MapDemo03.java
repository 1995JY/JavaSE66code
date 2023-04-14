package com.ieheima.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Integer i1=map.put("张三",23);
        Integer i2=map.put("李四",24);
        Integer i3=map.put("王五",25);
        Integer i4=map.put("赵六",28);
        Set<String> mapKey = map.keySet();
        for (String s : mapKey) {
            System.out.println(s+"-----"+map.get(s));
        }

    }
}
