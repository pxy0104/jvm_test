package com.xxx.string;

import org.junit.Test;

/**
 * 2023/4/20
 * 字符串的不变性
 **/

public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        s2 += "def";
        System.out.println(s2);
    }
    @Test
    public void test2(){
        String s1 = "abc";
        String s2 = s1.replace('a','m');
        System.out.println(s2);
        System.out.println(s1);
    }
}
