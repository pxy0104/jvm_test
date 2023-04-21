package com.xxx.gc;

/**
 * 2023/4/21
 * 垃圾回收器：
 * 测试 jdk8中是否采用引用计数器算法
 **/

public class GCTest {
        // 这个成员属性的唯一作用就是占用一点内存
        private final byte[]  bigSize = new byte[5*1024*1024];
        // 引用
        Object reference = null;
        public static void main(String[] args){
            GCTest obj1 = new GCTest();
            GCTest obj2 = new GCTest();

            obj1.reference = obj2;
            obj2.reference = obj1;
            obj1 = null;
            obj2 = null;
            // 显示的执行垃圾收集行为
            // 这里发生GC，obj1和obj2是否被回收？
//            System.gc();
        }
}
