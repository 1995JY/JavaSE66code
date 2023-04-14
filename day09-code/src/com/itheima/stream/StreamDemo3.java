package com.itheima.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo3 {
    /*
        Stream流的中间操作 :

               public Stream<T> filter(Predicate<? super T> predicate) : 对流中的数据进行筛选
                                                                            - 重写Predicate的test方法
                                                                            - 根据方法返回的true, false, 决定是否保留

                                list.stream().filter(new Predicate<String>() {
                                    @Override
                                    public boolean test(String s) {
                                        return 组织筛选逻辑, 返回true, false;
                                    }
                                })
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));

        // 1. 匿名内部类
        // 2. 改进为Lambda表达式
        // 3. 删掉现有代码, 使用流水线式操作思想
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
