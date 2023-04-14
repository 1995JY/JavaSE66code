package com.itheima.system;

public class SystemDemo {
    /*
        System类常见的方法 :

            1. public static long currentTimeMillis() : 获取时间原点到当前所经历过的毫秒值
                                                            -  时间原点 : 1970-1-1 00:00:00
                                                            -  考虑时区 : 1970-1-1 08:00:00

               - 用于当做时间戳进行使用.

               - System.out.println(UUID.randomUUID().toString());  随机的产生一组数据

            2. public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) : 数组拷贝

                                        参数1: 数据源
                                        参数2: 拷贝的起始索引
                                        参数3: 数据目的
                                        参数4: 拷贝的目标索引
                                        参数5: 拷贝的个数

     */
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        int[] newArr = new int[3];

        // 33 44 55
        System.arraycopy(arr, 2, newArr, 0, 3);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }
}
