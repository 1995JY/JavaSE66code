package com.itheima.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo1 {
    /*
        编码和解码 :

                编码 : 将可以看懂的字符, 变成看不懂的字节
                        public byte[] getBytes() : 使用平台默认字符集, 进行编码
                        public byte[] getBytes(String charsetName) : 使用指定字符集, 进行编码

                解码 : 将看不懂的字节, 变成能看懂的字符
                        public String(byte[] bytes) : 使用平台默认字符集, 进行解码
                        public String(byte[] bytes, String charsetName) : 使用指定字符集, 进行解码


        细节:
                26个英文字母(大小写), 标点符号, 这些字符, 只占用1个字节, 并且还是正数的字节

                中文汉字字符, 第一个字节绝对是负数, 后面的可能是正数

                UTF-8 :  一个中文占用3个字节
                GBK : 一个中文占用2个字节
     */
    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] bys = {-60, -29, -70, -61, -60, -29, -70, -61};
        String s = new String(bys, "gbk");
        System.out.println(s);

        System.out.println("-----------------------------");

        System.out.println(Arrays.toString("你好".getBytes()));
        System.out.println(Arrays.toString("abc".getBytes()));
        System.out.println(Arrays.toString(",!@".getBytes()));

    }
}
