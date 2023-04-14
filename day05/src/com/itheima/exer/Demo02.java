package com.itheima.exer;

import java.util.Calendar;
import java.util.concurrent.CancellationException;

/*
计算今天是一年中的第几天,计算今天是不是星期四，是的话展示疯狂星期四。
 */
public class Demo02 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        int day_of_year=c.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是"+c.get(Calendar.YEAR)+"年的第"+day_of_year+"天");
        int day_of_week=c.get(Calendar.DAY_OF_WEEK);
        if(day_of_week==3){
            System.out.println("疯狂星期四！！");
        }else{
            System.out.println("今天不是星期四，没有疯狂星期四套餐");
        }

    }
}
