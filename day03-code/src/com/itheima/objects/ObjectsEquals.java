package com.itheima.objects;

import java.util.Objects;

public class ObjectsEquals {
    /*
        Objects中的equals方法, 能够解决的, 只是加入了非null判断.

        你真正在比较的时候, 还需要依靠自己重写的equals方法.

     */
    public static void main(String[] args) {

        Phone p1 = new Phone("华为", 5999);
        Phone p2 = new Phone("华为", 5999);

        System.out.println(Objects.equals(p1, p2));

        System.out.println("后续的代码, 可以继续执行...");

    }
}


class Phone {
    private String brand;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && Objects.equals(brand, phone.brand);
    }


    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}