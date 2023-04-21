package com.xxx.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 2023/4/21
 **/

public class GCRootTest {
    public static void main(String[] args) {
        ArrayList numList = new ArrayList();
        Date birth = new Date();
        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("数据添加完毕，请操作");
            new Scanner(System.in).next();
            numList = null;
            birth = null;

            System.out.println("numList -- birth已置空");
            new Scanner(System.in).next();
            System.out.println("结束");
        }
    }
}
