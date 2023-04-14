package com.itheima.exer;

import com.itheima.domain.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class ExerTest {
    public static void main(String[] args) {
        Collection<Movie> m=new ArrayList<>();
        m.add(new Movie("肖申克的救赎",9.7,"小帅"));
        m.add(new Movie("霸王别姬",9.6,"张国荣"));
        m.add(new Movie("阿甘正传",9.7,"汤姆汉克斯"));

        Iterator<Movie> a=m.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
        System.out.println("-----------------------");
        for(Movie b:m){
            System.out.println(b);
        }
        System.out.println("-----------------------");
        m.forEach(System.out::println);
    }
}
