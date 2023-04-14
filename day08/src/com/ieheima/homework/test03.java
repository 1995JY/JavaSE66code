package com.ieheima.homework;


import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/*
* 有四种水果(苹果，香蕉，西瓜，橘子)
1. 给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复。
2. 根据商品号查询对应的商品。
   如果查不到输出：“查无此商品”
   如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
 */
public class test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TreeMap<String,String> map=new TreeMap<>();

        while (true) {
            System.out.println("请输入您的选择：1.添加商品  2.查询商品  3.商品总览  4.删除商品  5.退出");
            int result= 0;
            try {
                result = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("输入格式有误，请重新输入：");
                continue;
            }

            switch (result){
                //添加商品
                case 1:
                    System.out.println("请输入您向添加的商品：");
                    String value=sc.nextLine();
                    if("5".equals(value)){
                        System.out.println("拜拜啦");
                        System.exit(0);
                    }
                    String key;
                    while (true) {
                         key=generateCode();
                        if(!(map.containsKey(key))){
                            map.put(key,value);
                            break;
                        }
                    }
                    System.out.println("商品输入成功，商品编码："+key+"，商品为："+value);
                    break;
                    //根据商品编码查询商品
                case 2:
                    while (true) {
                        System.out.println("请输入商品编码：");
                        String str=sc.nextLine();
                        if("5".equals(str)){
                            System.out.println("拜拜啦");
                            System.exit(0);
                        }
                        if(map.containsKey(str)){
                            System.out.println("商品编码为："+str+"，商品为："+map.get(str));
                            break;
                        }else{
                            System.out.println("您输入的编码不存在，请检查后重新输入！");

                        }
                    }
                    //打印商品清单，总览商品
                case 3:

                    System.out.println(map);
                    break;
                    // 根据商品编码，删除商品
                case 4:
                    while (true) {
                        System.out.println("请输入商品编码：");
                        String str=sc.nextLine();
                        if("5".equals(str)){
                            System.out.println("拜拜啦");
                            System.exit(0);
                        }
                        if(map.containsKey(str)){
                            map.remove(str);
                            System.out.println("删除成功！");
                            break;
                        }else{
                            System.out.println("您输入的编码不存在，请检查后重新输入！");

                        }
                    }
                    break;
                    // 退出管理列表
                case 5:
                    System.out.println("拜拜啦");
                    System.exit(0);
                default:
                    System.out.println("输入范围有误，请选择范围1-5之间整数，并重新输入：");
            }

        }
    }

    public static String generateCode(){
        StringBuilder sb=new StringBuilder();
        Random r=new Random();
        for (int i = 0; i < 8; i++) {
            sb.append(r.nextInt(9));
        }
        return sb.toString();
    }

}
