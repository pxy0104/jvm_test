package com.xxx.directmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 2023/4/19
 * 测试直接内存报 OOM
 **/

public class DirectMTest {
    private static final long _1MB = 1024*1024;
    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
