package com.xxx.string;

/**
 * 2023/4/20
 *
 * new String("abc")会创建几个对象？
 **/

public class StringNewTest {
    public static void main(String[] args) {
        //String s = new String("11")会创建两个对象，一个是new对象，还有一个是“11”，
        // “11”存放在字符串常量池中,而s指向堆区的String实例
        String s = new String("abc");
        s.intern();
        String s1 = "abc";
        System.out.println(s == s1);
//        String s1 = new String("a")+new String("b");
//        这种形式和new String("")创建字符串的区别在于这种形式不会在字符串常量池中创建字符串
//        所以s3.intern()会在常量池中判断是否有“11”这样的串（无），然后在池子中创建一个“11”这样的串，
//         并将“11”的引用给到自己(s3)
        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3==s4); //jdk8 : true
    }
}
