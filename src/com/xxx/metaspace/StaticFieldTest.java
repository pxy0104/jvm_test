package com.xxx.metaspace;

/**
 * 2023/4/18
 **/

public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];
    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

    }
}