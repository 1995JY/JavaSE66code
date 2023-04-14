package com.itheima.jdk8.p7_Zone;


import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdDemo {
    /*
        ZoneId类 : 时区类

        常见方法 :

               1. static Set<String> getAvailableZoneIds() : 获取Java中支持的所有时区
               2. static ZoneId systemDefault() : 获取系统默认时区
               3. static ZoneId of(String zoneId) : 获取一个指定时区


        -----------------------------------------------------------------------

        https://www.zeitverschiebung.net/cn/timezone/africa--nairobi
     */
    public static void main(String[] args) {
        Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set.size());
        System.out.println(set);

        System.out.println("-------------------------");

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        System.out.println("-------------------------");


        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Africa/Nairobi"));
        System.out.println(zonedDateTime);
    }
}
