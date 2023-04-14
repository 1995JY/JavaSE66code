package com.itheima.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo {
    /*
        ------------------------------------------
        LocalDate、LocalTime、LocalDateTime

        对象的创建方式:

        1. now() : 当前时间

        2. of(...) : 设置时间

        ------------------------------------------
        LocalDateTime 转换LocalDate, LocalTime

        1. toLocalDate()
        2. toLocalTime()
     */
    public static void main(String[] args) {
        // 获取此刻的时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取指定的时间对象
        LocalDateTime of = LocalDateTime.of(2023, 3, 27, 10, 10, 10);
        System.out.println(of);

    }
}
