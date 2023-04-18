package com.xxx.heap;

import java.util.ArrayList;
import java.util.Random;

/**
 * 2023/4/18
 * 报错：OOM - OutOfMemoryError
 **/

public class HeapOOM {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
//            list.clone();
            list.add(new Random().nextInt(1024*1024));
        }
    }
}
