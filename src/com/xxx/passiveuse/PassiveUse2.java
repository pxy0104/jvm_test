package com.xxx.passiveuse;

import org.junit.Test;

/**
 * 2023/4/25
 * 引用常量不会触发此类或接口的初始化。
 * 因为常量在链接阶段就已经被显式赋值了。
 **/

class Person{
    public static final int NUM = 1;

    static {
        System.out.println("Person is initialized.");
    }
}

public class PassiveUse2 {
    @Test
    public void test(){
        System.out.println(Person.NUM);
    }
    @Test
    public void test1(){
        try {
            ClassLoader.getSystemClassLoader().loadClass("com.xxx.passiveuse.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
