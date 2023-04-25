package com.xxx.activeuse;

import org.junit.Test;

/**
 * 2023/4/25
 * 当使用java.lang.reflect中的方法反射类的方法时。
 * 比如: Class.forName("com.atguigu.java.Test")
 **/

public class ActiveUse3 {
    @Test
    public void test1() {
        try {
            Class<?> clazz = Class.forName("com.xxx.activeuse.Order");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
