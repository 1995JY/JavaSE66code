package com.itheima.tempLate;

public abstract class TextTempLate {
    public final void write(){
        System.out.println("我的爸爸");
        body();
        System.out.println("这就是我的爸爸！");

    }
    public abstract void body();
}
class tony extends TextTempLate{

    @Override
    public void body() {
        System.out.println("我的爸爸是一个辛苦的劳动人民");
    }
}
