package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {

    /*
        IO流标准异常处理代码 : JDK7版本之前

                    FileOutputStream fos = null;

                    try {
                        fos = new FileOutputStream("day10-code\\a.txt");
                        fos.write("地振高冈一派西山千古秀".getBytes());

                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (fos != null) {
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

     */

    /*
        IO流异常的处理,标准代码 : JDK7+

        try
            (需要关流的对象)
            {逻辑代码}
        catch(捕获的异常){
            异常处理方式
        }

        将需要关流的对象, 放在try的()中, 在代码运行完毕, 或者是代码运行过程中遇到了异常, 都会自动调用close方法
     */

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("day10-code\\a.txt");){
            fos.write("abc".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class A implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("看看我关了没有?");
    }
}

