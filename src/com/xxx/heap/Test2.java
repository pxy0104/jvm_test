package com.xxx.heap;

/**
 * 2023/4/18
 * 测试栈上分配 是否会引起栈溢出
 * -Xms256m -Xmx256m -XX:+PrintGCDetails
 **/

public class Test2 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间:"+ (end- l)+"ms");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static class User{
    }
    private static void alloc(){
        User user = new User();
    }
}
