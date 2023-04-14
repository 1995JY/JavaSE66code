package com.ieheima.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo06 {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        map.put(new Student("张三",23),"北京");
        map.put(new Student("李四",24),"上海");
        map.put(new Student("王五",25),"广州");
        map.put(new Student("张三",23),"成都");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
    }
}
