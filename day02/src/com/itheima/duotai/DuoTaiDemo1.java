package com.itheima.duotai;

public class DuoTaiDemo1 {
    public static void main(String[] args) {
        animalEat(new dog());
        animalEat(new cat());

    }
    public static void animalEat(animal a){
        a.eat();
        if(a instanceof dog){
            dog d=(dog)a;
            d.watchHome();
        }else if(a instanceof cat){
            cat c=(cat)a;
            c.catchMouse();
        }

    }
}
class animal{
    public void eat(){
        System.out.println("吃饭");
    }
}
class dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void watchHome(){
        System.out.println("狗看家");
    }
}

class cat extends animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){

    }
}
class pig extends animal{
    @Override
    public void eat() {
        System.out.println("猪吃糠");
    }
}

