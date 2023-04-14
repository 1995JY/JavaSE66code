package com.itheima.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class FileReaderTest {
    /*
        需求: 统计c.txt文件中, 每一个字符出现的次数

        运行效果 :
                    a : 3次
                    b : 2次
                    c : 6次
                    ...
     */
    public static void main(String[] args) throws IOException {

        // 1. 创建Map集合用于统计操作
        TreeMap<Character, Integer> hm = new TreeMap<>();

        // 2. 创建字符输入流读取文件
        FileReader fr = new FileReader("day10-code\\c.txt");

        // 3. 从文件中读取数据
        int i;
        while((i = fr.read()) != -1){
            // i : 读取到的字符, 但是需要强转成char类型
            char c = (char) i;
            // 4. 统计操作
            if(!hm.containsKey(c)){
                hm.put(c, 1);
            }else{
                hm.put(c, hm.get(c) + 1);
            }
        }

        // 5. 关闭流释放资源
        fr.close();

        // 6. 展示map集合中的数据
        hm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                System.out.println(key + " : " + value + "次");
            }
        });

    }
}
