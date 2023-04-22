package com.xxx.gc;

import java.util.ArrayList;

/**
 * 2023/4/22
 * -XX:+PrintCommandLineFlags
 *
 * jps
 * jinfo -flag Use__GC pid
 **/

public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        while (true) {
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
