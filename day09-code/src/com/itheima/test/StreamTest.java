package com.itheima.test;

import com.itheima.domain.Actor;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
    /*
        案例需求：现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作

            - 男演员只要名字为3个字的前三人
            - 女演员只要姓林的，并且不要第一个
            - 把过滤后的男演员姓名和女演员姓名合并到一起
            - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据

            演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
     */
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        // 男演员只要名字为3个字的前三人
        Stream<String> s1 = manList.stream().filter(s -> s.length() == 3).limit(3);

        // 女演员只要姓林的，并且不要第一个
        Stream<String> s2 = womanList.stream().filter(s -> s.startsWith("林")).skip(1);

        // 把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> s3 = Stream.concat(s1, s2);

        // 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        s3.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                Actor a = new Actor(s);
                System.out.println(a);
            }
        });


    }
}
