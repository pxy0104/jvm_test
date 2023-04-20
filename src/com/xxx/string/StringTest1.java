package com.xxx.string;

import org.junit.Test;

/**
 * 2023/4/20
 **/

public class StringTest1 {
    @Test
    public void test1() {
        //编译优化-前端编译器做了代码优化 s2="abc"
        String s1 = "a" + "b" + "c";
        String str = new String("abc");
        String str1 = str.intern();

        String s2 = "abc"; //位于字符串常量池内
        System.out.println(str1 == s2);
        System.out.println(str.equals(s1));
        str = str.intern();

        System.out.println(str == s1);
        System.out.println(str == s2);
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4); // true 编译期优化
        System.out.println(s3 == s5); // false s1是变量，不能编译期优化
        System.out.println(s3 == s6); // false s2是变量，不能编译期优化
        System.out.println(s3 == s7); // false s1、s2都是变量
        System.out.println(s5 == s6); // false s5、s6 不同的对象实例
        System.out.println(s5 == s7); // false s5、s7 不同的对象实例
        System.out.println(s6 == s7); // false s6、s7 不同的对象实例
        String s8 = s6.intern();
        System.out.println(s3 == s8); // true intern之后，s8和s3一样，指向字符串常量池中的"javaEEhadoop"
    }

    @Test
    public void test3() {
        String s0 = "beijing";
        String s1 = "bei";
        String s2 = "jing";
        String s3 = s1 + s2;
        System.out.println(s0 == s3); // false s3指向对象实例，s0指向字符串常量池中的"beijing"
        String s7 = "shanxi";
        final String s4 = "shan";
        final String s5 = "xi";
        String s6 = s4 + s5;
        System.out.println(s6 == s7); // true s4和s5是final修饰的，编译期就能确定s6的值了
    }

    @Test
    public void test4() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
//    StringBuilder sb = new StringBuilder("123");
//    sb.toString();
        System.out.println(s3 == s4); //false
    }
}
