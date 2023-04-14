package com.itheima.JDK8plus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class birthCount {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 7, 13);
        long age= ChronoUnit.YEARS.between(birthday,now);
        System.out.println(age);

    }
}
