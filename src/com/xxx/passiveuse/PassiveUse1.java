package com.xxx.passiveuse;

import org.junit.Test;

/**
 * 2023/4/25
 *当访问一个静态字段时，只有真正声明这个字段的类才会被初始化
 *  当通过子类引用父类的静态变量，不会导致子类初始化
 *通过数组定义类引用，不会触发此类的初始化
 *引用常量不会触发此类或接口的初始化。因为常量在链接阶段就已经被显式赋值了。
 *调用CLassLoader类的LoadClass()方法加载一个类，并不是对类的主动使用，不会导致类的初始化
 **/

public class PassiveUse1 {
    @Test
    public void test(){
        System.out.println(Child.num);
    }
    //通过数组定义类引用，不会触发此类的初始化
    @Test
    public void test1(){
        Parent[] parents = new Parent[10];
    }
}
class Parent{
    static {
        System.out.println("Parent 的初始化过程");
    }
    public static int num = 1;
}
class Child extends Parent{
    static{
        System.out.println("Child is initialized.");
    }
}

