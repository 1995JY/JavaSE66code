package com.itheima.exception;

public class ExceptionDemo5 {
    /*
        异常的第二种处理方案 :  try...catch

            快捷键: 选中要包裹的代码, ctrl + alt + T

            try {
                可能会出现异常的代码
            } catch (要捕获的异常类名 对象名) {
                异常的处理方案
            }

            好处: 不会将程序终止, 后续的代码还可以继续执行.
            注意1: 如果编写了多个catch, 最大的异常一定要放在最后捕获.
            注意2: catch中可以同时捕获多个异常, 中间使用 | 进行分割 (不建议)
                        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
                        原因: 无法对异常进行精准的处理

     */
    public static void main(String[] args) {

        System.out.println("开始");



        try {
            System.out.println(10 / 0);

            int[] arr = {11,22,33};

            System.out.println(arr[10]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            // 展示完整的异常信息, 虽然是红色的字体, 但是不会影响后续代码的执行!!!
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获了数组索引越界异常...");
        } catch (Exception e) {
            System.out.println("捕获了其他的异常...");
        }


        System.out.println("结束");

    }
}
