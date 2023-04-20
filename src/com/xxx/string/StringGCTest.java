package com.xxx.string;

/**
 * 2023/4/20
 * string table 的垃圾回收
 * -XX:PrintGCDetails -Xms=15m -Xmx=15m -XX:PrintStringTableStatistics
 **/

public class StringGCTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }
}
