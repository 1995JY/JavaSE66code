package com.itheima.single;

import java.util.Calendar;

public class SingleDemo {
    /*
        单例设计模式: 保证类的对象, 在内存中只有一份

                1. 饿汉式 :

                        class Student {
                            // 1. 私有构造方法(为了不让其他人创建本类对象)
                            private Student(){}

                            // 2. 手动创建本类对象
                            public static final Student STU = new Student();
                        }

                        --------------------------------------------------------------

                        class Student {
                            // 1. 私有构造方法(为了不让其他人创建本类对象)
                            private Student(){}

                            // 2. 手动创建本类对象
                            private static final Student STU = new Student();

                            // 3. 编一个方法, 专门获取对象
                            public static Student getInstance(){
                                return STU;
                            }
                        }

                 2. 懒汉式

                        class Student {
                            private Student() {
                            }

                            private static Student STU;

                            public static Student getInstance() {
                                if (STU == null) {
                                    STU = new Student();
                                }
                                return STU;
                            }
                        }

                        注意: 在多线程并发访问的时候, 就会出现安全隐患问题 (可能会出现多个对象)

                        ------------------------------------------------------

                        class Student {
                            // 1. 私有构造方法(为了不让其他人创建本类对象)
                            private Student() {
                            }

                            // 2. 手动创建本类对象
                            private static Student STU;


                            // 3. 编一个方法, 专门获取对象
                            public static Student getInstance() {
                                synchronized (Student.class) {
                                    if (STU == null) {
                                        STU = new Student();
                                    }
                                }
                                return STU;
                            }
                        }


                        ------------------------------------------------------

                        class Student {
                            private Student() {
                            }

                            private static Student STU;

                            public static Student getInstance() {
                                if (STU == null) {
                                    synchronized (Student.class) {
                                        if (STU == null) {
                                            STU = new Student();
                                        }
                                    }
                                }

                                return STU;
                            }
                        }


     */
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Student stu = Student.getInstance();
                    System.out.println(Thread.currentThread().getName() + stu);
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Student stu = Student.getInstance();
                    System.out.println(Thread.currentThread().getName() + stu);
                }
            }
        }).start();


    }
}

class Student {
    // 1. 私有构造方法(为了不让其他人创建本类对象)
    private Student() {
    }

    // 2. 手动创建本类对象
    private static Student STU;


    // 3. 编一个方法, 专门获取对象
    public static Student getInstance() {
        if (STU == null) {
            synchronized (Student.class) {
                if (STU == null) {
                    STU = new Student();
                }
            }
        }

        return STU;
    }
}
