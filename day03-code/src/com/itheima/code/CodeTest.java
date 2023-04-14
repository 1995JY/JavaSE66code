package com.itheima.code;

public class CodeTest {
    /*
        代码块 : 代码中的一对 {}

            1. 局部代码块 : 方法中的一对{}
                                - 限定变量的生命周期, 提早的释放内存
            2. 构造代码块 : 类中方法外的一对{}
                                - 在创建对象的时候, 被调用执行, 且优先于构造方法执行.
                                - 使用场景: 发现多个构造方法中, 存在相同的代码, 就可以考虑将这段代码, 抽取到构造代码块中

            3. 静态代码块 : 类中方法外的一对{} 需要加入static修饰
                                - 随着类的加载而执行, 且只执行一次. (因为类只加载一次)
                                - 在项目启动的时候, 加载配置文件
     */
    public static void main(String[] args) {
        {
            int num = 10;
            System.out.println(num);
        }

        Student stu1 = new Student();
        Student stu2 = new Student(10);

    }
}

class Student {

    static {
        System.out.println("Student类的静态代码块, 我执行了...");
    }

    public Student() {
        System.out.println("空参构造方法...");
    }

    public Student(int num) {
        System.out.println("带参数构造方法...");
    }

}
