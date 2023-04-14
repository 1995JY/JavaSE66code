package com.itheima.fx;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    /*
        泛型的好处 :
            1. 可以对集合中存储的数据, 进行类型限制
            2. 避免了强转的麻烦事
                    - 一个该给泛型的对象, 没有指定泛型, 默认就是Object

                        Iterator it = list.iterator();
                        while(it.hasNext()){
                            String s = (String) it.next();
                            s.length();
                        }


         ---------------------------------------------------------

          泛型学什么?

            1. 泛型类
                        - 在创建对象的时候, 确定具体类型
            2. 泛型方法
                        - 静态方法 : 调用方法的时候, 确定具体类型(根据实际参数去匹配)
                        - 非静态方法 : 跟着类的泛型去匹配
            3. 泛型接口
                        - 1. 实现接口的时候, 就指定具体的类型
                        - 2. 让实现类自己, 加入泛型 (泛型的传递)
            4. 泛型的限定
                        - ? : 通配符
                        - ? extends E : 可以传入的是E, 或者是E的子类
                        - ? super E : 可以传入的是E, 或者是E的父类

     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }

    }
}
