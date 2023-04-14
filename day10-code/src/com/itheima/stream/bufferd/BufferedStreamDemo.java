package com.itheima.stream.bufferd;

import java.io.*;

public class BufferedStreamDemo {
    /*
        缓冲流, 本身不具备读写功能, 只是对普通的流对象进行包装, 提高读写效率

        字节缓冲输入流:
                public BufferedInputStream(InputStream in) :
                思考 : InputStream是一个抽象类, 不允许创建对象, 传入的应该是子类 FileInputStream对象.

        字节缓冲输出流:
                public BufferedOutputStream(OutputStream out) :
                思考 : OutputStream是一个抽象类, 不允许创建对象, 传入的应该是子类 FileOutputStream对象.

     */
    public static void main(String[] args) throws IOException {

        // 1. 创建缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.flv"));
        // 2. 创建缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy1.flv"));

        // 3. 读写操作
        int i;
        while((i = bis.read()) != -1){
            bos.write(i);
        }

        // 4. 关闭流释放资源
        bis.close();
        bos.close();
    }
}
