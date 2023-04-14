package com.itheima.set;

import com.itheima.domain.Student;

import java.util.HashSet;

public class HashSetDemo {
    /*
        目标1: HashSet保证元素唯一, 是哪两个方法在配合 ?
                    - hashCode和equals

        目标2: 这两个方法是怎样配合使用的?
                    - 添加元素的时候, 先调用该对象的hashCode方法, 计算出一个应该存入的索引位置
                    - 到数组中查找, 该位置是否存在元素
                            - 不存在: 直接存
                            - 存在: 调用equals方法比较内容
                                        true : 不存
                                        false : 存

        目标3: 重写hashCode方法的时候, 应该让对象的属性, 都参与到哈希值的计算
                    - 如果对象的属性不相同, 返回的哈希值, 尽量不相同
     */
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        hs.add(new Student("张三", 23));
        hs.add(new Student("李四", 23));
        hs.add(new Student("王五", 23));
        hs.add(new Student("王五", 23));

        System.out.println(hs);


    }
}
