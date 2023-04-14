package com.itheima.mabstract;

public class AbstractDemo2 {
    /*
        抽象类的注意事项:

            1. 抽象类不允许实例化 (不允许创建对象)
                    - 因为如果允许实例化, 我们就可以调用内部, 没有方法体的抽象方法了

            2. 抽象类虽然不能创建对象, 但是内部还是存在构造方法的
                    - 作用: 交给子类通过super()进行访问.

            3. 抽象类中是允许编写普通方法
                    - 作用: 交给子类直接继承到, 使用的.

            4. 作为抽象类的子类
                     1. 重写所有抽象方法 (推荐)
                     2. 将子类自己也变成抽象类
     */
    public static void main(String[] args) {
        
    }
}


