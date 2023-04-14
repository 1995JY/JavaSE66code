package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    /*
        Map集合的第二种遍历方式 : 根据键值对对象, 获取键和值

            Student : name, age
            Entry : key, value

        ------------------------------------------------

        public Set<键值对对象> entrySet() : 返回集合中所有的键值对对象

        public Set<Map.Entry<K,V>> entrySet() : 返回集合中所有的键值对对象

                Entry : 键值对对象
                        - 是Map里面的一个内部类
     */
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "北京");
        hm.put("李四", "上海");
        hm.put("王五", "广州");

        // 1. 获取集合中, 所有的键值对对象
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        // 2. 遍历集合获取每一个键值对对象
        for (Map.Entry<String, String> en : entrySet) {
            // 3. 获取键和值
            System.out.println(en.getKey() + "---" + en.getValue());
        }
    }
}
