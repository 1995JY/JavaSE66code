package com.itheima.homework;
/*
完成代码(按照标准格式写)，然后在测试类中测试。
1.手机类Phone
属性:品牌brand,价格price
无参构造,有参构造
行为:打电话call,发短信sendMessage,玩游戏playGame
2.测试类
创建Phone类对象,调用Phone类中的方法
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone("huawei",3999.0);
        p.call();
        p.sendMessage();
        p.playGame();
        System.out.println(p.getSize());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

    }
}
class Phone{
   private String brand;
   private double price;
   private final int size=6;

    public int getSize() {
        return size;
    }

    public Phone(){

   }
   public Phone(String brand,double price){
        this.brand=brand;
        this.price=price;

   }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
