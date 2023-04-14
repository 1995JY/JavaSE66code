package com.itheima.test;

import com.itheima.domain.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MovieTest {
    public static void main(String[] args) {
        Collection<Movie> c = new ArrayList<>();

        c.add(new Movie("肖申克救赎", 9.7, "蒂姆罗宾斯"));
        c.add(new Movie("霸王别姬", 9.6, "张国荣"));
        c.add(new Movie("阿甘正传", 9.5, "汤姆汉克斯"));

        // 1. 迭代器
        Iterator<Movie> it = c.iterator();
        while (it.hasNext()) {
            Movie m = it.next();
            System.out.println(m);
        }

        System.out.println("-------------------------");

        // 2. 增强for
        for (Movie movie : c) {
            System.out.println(movie);
        }

        System.out.println("-------------------------");

        // 3. forEach
        c.forEach(movie -> System.out.println(movie));
    }
}
