package com.xxx.string;

/**
 * 2023/4/20
 **/

public class StringTableTest {
    public static void main(String[] args) {
//        char l = 'a';
        System.out.println("Size of char : "+Character.SIZE/8+" bytes."); //char类型占有2个字节

        String China = "中国";
        String letter = "z";
        String ChinaUTF = "\u4e2d\u56fd"; //中国--占UTF-16两个代码单元，即4个字节，所以一个汉字在UTF-16中占两个字节大小
        String letterUTF = "\u007A";    // z 在UTF-16中占一个代码单元，即2个字节，和汉字一样，但是为一个字符

        System.out.println(letterUTF);
        System.out.println(letter.length());//获取该字符占UTF-16几个代码单元
        System.out.println(letter.codePointCount(0,letter.length()));//表示该字符串占几个字符
    }
}
