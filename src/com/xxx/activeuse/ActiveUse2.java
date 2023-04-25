package com.xxx.activeuse;

import java.util.Random;

/**
 * 2023/4/25
 * 当使用类、接口的静态字段时(final修饰特殊考虑)，
 * 比如，使用getstatic或者putstatic指令。 (对应访问变量、赋值变量操作)
 *
 * 当初始化子类时，如果发现其父类还没有进行过初始化，
 * 则需要先触发其父类的初始化
 **/
class User{
    static {
        System.out.println("初始化过程");
    }
    public static final int num = 1;
    public static int num1 = 2;
    public static final int rand = new Random().nextInt(10);
}
public class ActiveUse2 {
    static {
        System.out.println("主类初始化");
    }
    public static void main(String[] args) {
        System.out.println(User.num);
        System.out.println(User1.num2);
    }
}
class User1 implements IA{
    static {
        System.out.println("User1 初始化");
    }
    public static int num2 = 1;
}
interface IA{
    public static final Thread t = new Thread(){
        {
            System.out.println("A接口初始化");
        }
    };
}