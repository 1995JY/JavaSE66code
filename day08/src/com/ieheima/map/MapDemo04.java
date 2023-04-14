package com.ieheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Integer i1=map.put("张三",23);
        Integer i2=map.put("李四",24);
        Integer i3=map.put("王五",25);
        Integer i4=map.put("赵六",28);
        Set<Map.Entry<String,Integer>> entry=map.entrySet();
        for(Map.Entry<String,Integer> a:entry){
            System.out.println(a.getKey()+"-----"+a.getValue());
        }
    }
}
