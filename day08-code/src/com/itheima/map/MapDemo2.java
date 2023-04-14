package com.itheima.map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    /*
        Map集合的第一种遍历方式 : 键找值

            public V get(Object key) : 根据键获取值
            public Set<K> keySet() : 返回集合中所有的键
     */
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "北京");
        hm.put("李四", "上海");
        hm.put("王五", "广州");

        // 1. 调用map集合的keySet方法, 获取所有的键
        Set<String> keySet = hm.keySet();
        // 2. 遍历set集合, 获取每一个键
        for (String key : keySet) {
            // 3. 在遍历的过程中, 调用get方法, 根据键找值
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
