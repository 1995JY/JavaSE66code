package com.itheima.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthdayTest {
    public static void main(String[] args) {
        // 1. 封装此刻的时间
        LocalDate now = LocalDate.now();
        // 2. 封装生日的时间
        LocalDate birthday = LocalDate.of(1990, 12, 16);
        // 3. 计算时间间隔(年)
        long age = ChronoUnit.YEARS.between(birthday, now);

        System.out.println(age);
    }
}
