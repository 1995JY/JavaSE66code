package com.itheima.calender;

import java.util.Calendar;

public class Demo01 {
    public static void main(String[] args) {

        Calendar a=Calendar.getInstance();
        System.out.println(a.get(Calendar.YEAR));
        System.out.println(a.get(Calendar.MONTH));
        System.out.println(a.get(Calendar.DAY_OF_MONTH));
        System.out.println(a.get(Calendar.DAY_OF_WEEK));
        System.out.println(a.get(Calendar.DAY_OF_YEAR));
        String[] arr={"","日","yi","er","san","si","wu","liu"};
        System.out.println(arr[a.get(Calendar.DAY_OF_WEEK)]);
    }
}
