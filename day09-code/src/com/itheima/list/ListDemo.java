package com.itheima.list;

import java.util.*;

public class ListDemo {
    /*
        不可变集合的创建和使用

                不可变集合: 添加, 修改, 删除都不行.

            1. 创建: 调用接口中的静态方法 of

                        List.of(...);
                        Set.of(...);
                        Map.of();
                                    - of方法, 最多允许传入10个键值对

            2. 使用:
                        A: 今后有一组数据, 完全不希望别人添加, 修改, 删除, 就可以考虑使用不可变的集合
                                - 问题: 为什么不用数组?
                                - 回答: 数组只是长度不可改变
                                - 问题: 数组加final呢?
                                - 回答: final修饰的数组, 不可改变地址值, 其内容依旧可变.

                                            final int[] nums = {11,22,33};
                                            nums[0] = 55;           // 编译通过
                                            nums = new int[10];     // 编译错误

                        B: 可以进行批量添加操作 (作用不大)

                                ArrayList<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
                                HashSet<Integer> hs = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));

                                以上操作, 可以使用Collections.addAll(); 来取代
                                -----------------------------------------------------------------------

                                以下操作, 不能使用Collections取代

                                Map<Integer, Integer> map = Map.ofEntries(
                                        Map.entry(1, 1),
                                        Map.entry(2, 2),
                                        Map.entry(3, 3),
                                        Map.entry(4, 4),
                                        Map.entry(5, 5),
                                        Map.entry(6, 6),
                                        Map.entry(7, 7),
                                        Map.entry(8, 8),
                                        Map.entry(9, 9),
                                        Map.entry(10, 10),
                                        Map.entry(11, 11)
                                );

                                TreeMap<Integer, Integer> tm = new TreeMap<>(map);

     */
    public static void main(String[] args) {

        Map<Integer, Integer> map = Map.ofEntries(
                Map.entry(1, 1),
                Map.entry(2, 2),
                Map.entry(3, 3),
                Map.entry(4, 4),
                Map.entry(5, 5),
                Map.entry(6, 6),
                Map.entry(7, 7),
                Map.entry(8, 8),
                Map.entry(9, 9),
                Map.entry(10, 10),
                Map.entry(11, 11)
        );

        TreeMap<Integer, Integer> tm = new TreeMap<>(map);

        System.out.println(tm);

    }
}
