package com.xxx.heap;

/**
 * 2023/4/17
 * -Xms10m -Xmx10m
 **/

public class Test1 {
    public static void main(String[] args) {
        System.out.println("thread is starting!");
        Runtime runtime = Runtime.getRuntime();
        double Xmx = runtime.maxMemory();
        double Xms = runtime.totalMemory();
        System.out.println("最大内存"+Xmx/1024/1024 + "M");
        System.out.println("初始内存"+Xms/1024/1024 + "M");
        System.out.println("系统内存"+Xms*64/1024/1024/1024 + "G");
        System.out.println("系统内存"+Xmx*4/1024/1024/1024 + "G");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("thread is going over");
    }
}
