package com.itheima.JDK8plus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatterDemo01 {
    public static void main(String[] args) {
        LocalDateTime t1=LocalDateTime.now();
        DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy年M月d日");
        String s="2008年12月12日";
        LocalDate t2=LocalDate.parse(s,d);
        System.out.println(d.format(t1));

    }
}
