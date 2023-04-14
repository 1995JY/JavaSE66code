package com.itheima.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
    /*
        自然排序: 类的对象, 自己知道该如何排序
        比较器排序: 告知集合对象该如何排序
     */
    public static void main(String[] args) {

        TreeSet<Phone> ts = new TreeSet<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });

        ts.add(new Phone(100));
        ts.add(new Phone(50));
        ts.add(new Phone(20));

        System.out.println(ts);

    }
}

class Phone {

    private double price;


    public Phone() {
    }

    public Phone(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{price = " + price + "}";
    }
}
