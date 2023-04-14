package com.itheima.IOStream.Output;

import java.io.FileOutputStream;
import java.io.IOException;
/*
IO流的异常标准处理方案  JDK7版本之前的写法

 */

public class FileOutputStreamDemo02 {
    public static void main(String[] args) {
        JDK7ioMethod();
        //JDK版本7开始的，写入流的异常补货
        try(FileOutputStream f=new FileOutputStream("day10\\a.txt",true)){
            f.write("woshishui".getBytes());
        }catch( IOException e){
            e.printStackTrace();
        }


    }

    private static void JDK7ioMethod() {
        FileOutputStream s1 = null;
        try {
            s1 = new FileOutputStream("day10\\a.txt");
            s1.write("你好，java".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (s1 != null) {
                try {
                    s1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
