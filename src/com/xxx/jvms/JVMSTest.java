package com.xxx.jvms;

import java.util.Date;

/**
 * 2023/4/16
 * 演示设置栈大小 对于栈中栈帧数量的影响
 **/

public class JVMSTest {
    public JVMSTest(){
        System.out.println("构造方法");
    }
    int a = 1;
    {
        System.out.println("普通代码块");
    }
    private static int count = 1;
    public static void main(String[] args) {
//        System.out.println(count++);
//        main(args);

        System.out.println("----");
        JVMSTest jvmsTest = new JVMSTest();
        System.out.println(count);
        {
            int num = 5;
            System.out.println("方法中代码块");
        }
    }

    public void add(){
        int num = 0;
        double d = 9.0;
        Date date = new Date();
        System.out.println(num);
    }
}
