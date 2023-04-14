package com.itheima.homework;

import java.util.ArrayList;

/*
需求 :  创建一个集合, 内部存储元素 ("15611111111", "18888888888", "156JQKA1234", "你好", "哈哈")

* 将集合中错误的手机号删除, 删除之后, 打印集合中剩余的元素
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("15611111111");
        arr.add("18888888888");
        arr.add("156JQKA1234");
        arr.add("你好");
        arr.add("哈哈");
        String s="[1][3-9]\\d{9}";
        for (int i = 0; i < arr.size(); i++) {
            if(!(arr.get(i).matches("[1][3-9]\\d{9}"))){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
}
