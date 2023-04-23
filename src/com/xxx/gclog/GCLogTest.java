package com.xxx.gclog;

/**
 * 2023/4/23
 * 在jdk7和8中测试
 * -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:+UseSerialGC
 **/

public class GCLogTest {
    private static final int _1MB = 1024*1024;
    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];
    }
    public static void main(String[] args) {
        testAllocation();
    }
}
