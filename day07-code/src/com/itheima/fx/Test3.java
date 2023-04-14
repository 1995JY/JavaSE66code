package com.itheima.fx;

public class Test3 {
    /*
        泛型方法 :

            1. 非静态的方法

                        - 需要在创建对象的时候, 才能够确定具体的类型
                        - 跟着类的泛型去匹配的
                        Student<String> stu = new Student<>();

                        class Student<E> {
                            public void setElement(E element) {
                                this.element = element;
                            }
                        }

            2. 静态的方法

                        静态优先于对象存在 (静态修饰的东西, 随着类的加载而加载)

                        - 静态方法中, 如果加入泛型, 必须声明出方法自己独立的泛型
                        - 问题: 静态方法中的泛型, 在什么时候能够确定具体类型呢?
                        - 回答: 在方法调用的时候, 能够确定具体类型


     */
    public static void main(String[] args) {

        Integer[] arr1 = {11,22,33};
        String[] arr2 = {"abc","bbb","ccc"};

        printArray(arr1);
        printArray(arr2);

    }

    public static<T> void printArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }
}
