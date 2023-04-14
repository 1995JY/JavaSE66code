package com.itheima.mextends;

public class PhoneTest {
    public static void main(String[] args) {
        AppleVersion2 a1=new AppleVersion2();
        a1.smallBlack();
    }
}
class AppleVersion1{
    public void call(){
        System.out.println("打电话");
    }
    public void smallBlack(){
        System.out.println("speak english");
    }

}
class AppleVersion2 extends AppleVersion1{
    @Override
    public void smallBlack() {
        super.smallBlack();
        System.out.println("还可以说中文");
    }
}
