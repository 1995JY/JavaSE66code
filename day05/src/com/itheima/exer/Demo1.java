package com.itheima.exer;

import java.util.Calendar;

/*
判断今年是不是闰年
 */
public class Demo1 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2023,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        if(c.get(Calendar.DAY_OF_MONTH)==29){
            System.out.println(c.get(Calendar.YEAR)+"是闰年");
        }else{
            System.out.println(c.get(Calendar.YEAR)+"不是闰年");
        }
        c.add(Calendar.MONTH,-1);
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

    }
}
