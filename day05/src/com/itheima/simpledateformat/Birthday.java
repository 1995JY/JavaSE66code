package com.itheima.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日（格式为：xxxx年xx月xx日）：");
        String str= new Scanner(System.in).nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday=sdf.parse(str);
        Date today=new Date();
        long livingDay=(today.getTime()-birthday.getTime())/(1000*60*60*24);
        System.out.println("存活了"+livingDay+"天");
    }
}
