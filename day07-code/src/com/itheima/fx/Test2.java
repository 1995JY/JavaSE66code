package com.itheima.fx;

public class Test2 {
    /*
        泛型类: 在自己定义类的时候, 加入泛型技术
                    - 泛型, 在什么时候确定具体的数据类型呢?
                    - 回答: 在创建对象的时候.
     */
    public static void main(String[] args) {

        Student<Integer> stu = new Student<>();


    }
}

// E : Element 元素
// T : Type 类型
// K : Key 键
// V : Value 值
class Student<E> {

    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
