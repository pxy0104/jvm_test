package com.xxx.clazzload;

import java.util.Random;

/**
 * 2023/4/25
 * 说明：使用static fianl修饰的字段的显示赋值的操作，到底是在哪个阶段进行的赋值？
 * 情况1：在链接阶段的准备环节赋值
 * 情况2：在初始化阶段<clinit>()中赋值
 **/

public class InitializationTest {
    public static int a = 1;//在链接阶段的准备环节赋值
    public static final int INT_CONSTANT = 10;//在链接阶段的准备环节赋值

    public static final Integer INTEGER_CONSTANT1 = Integer.valueOf(100);//在初始化阶段<clinit>()中赋值
    public static  Integer INTEGER_CONSTANT2 = Integer.valueOf(1000);//在初始化阶段<clinit>()中赋值
    public static final int NUM = new Random().nextInt(10);//在初始化阶段<clinit>()中赋值
    public static String s0 = "helloworld";//在初始化阶段<clinit>()中赋值
    public static final String s = new String("hello");//在初始化阶段<clinit>()中赋值

}
