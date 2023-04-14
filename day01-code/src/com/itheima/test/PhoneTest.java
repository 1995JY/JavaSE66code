package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        IPearVersion2 version2 = new IPearVersion2();
        version2.call();
        version2.smallBlack();
    }
}

class IPearVersion1 {

    public void call(){
        System.out.println("手机打电话...");
    }

    public void smallBlack(){
        System.out.println("speak english...");
    }

}

class IPearVersion2 extends IPearVersion1 {
    @Override
    public void smallBlack() {
        super.smallBlack();
        System.out.println("说中文...");
    }
}
