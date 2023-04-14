package com.itheima.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo4 {
    /*
        异常的第一种处理方案 : throws 抛出异常

        在方法的后面, 编写 throws 关键字, 再跟上异常类名

        细节1: 你调用的方法, 如果抛出了异常, 就需要继续声明 throws 抛出异常
        细节2: 如果一个方法中抛出的异常特别多, 可以选择抛出一个大的异常 (不推荐)
        细节3: 子类在重写父类方法的时候, 不能抛出父类中没有的异常, 或者是比父类更大的异常
                    - (父亲坏了, 儿子不能比父亲还坏)
     */
    public static void main(String[] args) throws Exception {

    }

    public static void method() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        String s = "abc";

        sdf.parse(s);

        FileReader fr = new FileReader("abc");
    }
}

class Fu {
    public void show()  {
        System.out.println("show...");
    }
}

class Zi extends Fu {

    @Override
    public void show()  {
        SimpleDateFormat sdf = new SimpleDateFormat();
        try {
            sdf.parse("");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
