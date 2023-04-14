package com.itheima.test;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class FileTest3 {
    /*
        需求 : 设计一个方法,  统计一个文件夹中, 所有文件类型出现的次数

            .txt :  1
            .docx : 2
            .png : 3

            ...
     */

    // 设计map集合, 键(文件类型) 值(出现的次数)
    static HashMap<String, Integer> hm = new HashMap<>();
    static int count;

    public static void main(String[] args) {

        File dir = FileTest1.getDir();

        getCount(dir);

        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println("." + key + " : " + value);
            }
        });

        if(count != 0){
            System.out.println("没有后缀名的文件:" + count);
        }

    }

    public static void getCount(File dir) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                // 是文件的话, 获取文件名
                String fileName = file.getName();
                // 获取文件的后缀名
                if (fileName.contains(".")) {
                    String[] sArr = fileName.split("\\.");
                    String type = sArr[sArr.length - 1];
                    // 判断该类型在Map集合中是否存在
                    if (!hm.containsKey(type)) {
                        // 第一次出现, 存入集合, 值的位置存1
                        hm.put(type, 1);
                    } else {
                        // 不是第一次出现, 存入集合, 值的位置 = 旧值 + 1
                        hm.put(type, hm.get(type) + 1);
                    }
                } else {
                    count++;
                }
            }else {
                // 是文件夹, 递归调用
                if(file.listFiles() != null){
                    getCount(file);
                }
            }
        }

    }
}
