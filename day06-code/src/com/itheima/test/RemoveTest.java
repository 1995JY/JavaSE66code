package com.itheima.test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class RemoveTest {
    /*
        集合在遍历的过程中进行删除操作 :

            1. 迭代器
                       不需要手动 -- 操作, 源码中自动做了这件事情

            2. 增强for
                        不能做删除

            3. foreach
                        不能做删除

            4. 普通for
                        A : 正序遍历, 索引--
                        B : 倒序遍历
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
        list.add("test");
        list.add("test");
        list.add("bbb");
        list.add("ccc");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if ("test".equals(s)) {
                    list.remove("test");
                }
            }
        });

        System.out.println(list);

    }
}
