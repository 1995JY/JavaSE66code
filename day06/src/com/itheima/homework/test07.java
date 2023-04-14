package com.itheima.homework;

import com.itheima.domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test07 {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("张三",23,170.1));
        list.add(new Person("李四",24,165.3));
        list.add(new Person("王五",25,182.6));
        list.add(new Person("西门吹雪",18,166.7));
        list.add(new Person("法外狂徒",36,195.5));

        double high=list.get(0).getHeight();
        double shortMan=list.get(0).getHeight();
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            Person p=it.next();
            if(high<p.getHeight()){
                high=p.getHeight();
            }
            if(shortMan>p.getHeight()){
                shortMan=p.getHeight();
            }
        }
        System.out.println(high);
        System.out.println(shortMan);
        for (Person person : list) {
            if(high== person.getHeight()){
                System.out.println("最高的人是"+person.getName()+",身高是："+person.getHeight());
            }
            if(shortMan== person.getHeight()){
                System.out.println("最矮的人是"+person.getName()+",身高是："+person.getHeight());
            }
        }
    }
}
