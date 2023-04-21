package com.xxx.gc;

import java.util.ArrayList;

/**
 * 2023/4/21
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 **/

public class HeapOOMJProfilerTest {
    private final byte[] bytes = new byte[1*1024*1024];
    public static void main(String[] args) {
        ArrayList<HeapOOMJProfilerTest> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                count ++;
                list.add(new HeapOOMJProfilerTest());
            }
        } catch (Throwable e){
            System.out.println("count :"+count);
            e.printStackTrace();
        }
    }
}
