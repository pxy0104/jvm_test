package com.xxx.string;

/**
 * 2023/4/20
 * 面试题
 **/

public class StringExer {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};
    public void change(String str,char[] ch){
        str = "test ok";
        ch[0] = 'b';
    }
    /*
     ex.str的值没有改变，是因为在change方法中，更改的是str参数的值，而不是实例变量this.str的值。
    在Java中，方法参数是按值传递的。当您调用ex.change(ex.str,ex.ch)时，ex.str的值（即字符串"good"）
    被复制并传递给change方法中的str参数。在change方法中，您将str参数的值更改为"test ok"，
    但这并不会影响实例变量this.str的值。因此，在执行完change方法后，当您在main方法中打印ex.str时，
    它仍然打印出来的是原来的值，即字符串"good"
     */
    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}
