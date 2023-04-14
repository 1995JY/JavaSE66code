package com.itheima.mextends;

public class ExtendsDemo1 {
    /*
        继承: 让类与类之间产生关系 (子父类关系) , 子类就可以直接使用父类中 [非私有的成员]

        实现继承的关键字 : extends

        继承的好处:
                1. 提高了代码的复用性
                2. 提高了代码的维护性

     */
    public static void main(String[] args) {
        Coder c = new Coder();
        c.setName("张三");
        c.setAge(23);
        c.setId("heima001");

        Manager m = new Manager();
        m.setName("李四");
        m.setAge(24);
        m.setId("heima002");

        System.out.println(c.getName() + "---" + c.getAge() + "---" + c.getId());
        System.out.println(m.getName() + "---" + m.getAge() + "---" + m.getId());

    }
}


class Employee {
    private String id;
    private String name;
    private int age;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Coder extends Employee {
}

class Manager extends Employee {
}

