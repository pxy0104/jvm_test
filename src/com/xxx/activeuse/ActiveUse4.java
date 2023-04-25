package com.xxx.activeuse;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.junit.Test;

/**
 * 2023/4/25
 **/
interface People{
    public static final Thread t = new Thread(){
        {
            System.out.println("初始化接口People");
        }
    };
    public default void speak() {
        System.out.println("说话");
    }
}

class Son implements People{
    static {
        System.out.println("Son 初始化");
    }
    public static int NUM = 1;
}

class Daughter extends Son{
    {
        System.out.println("Daughter is initialized.");
    }

    public static int A = 10;


}
public class ActiveUse4 {
    {
        System.out.println("ActiveUse4主类初始化");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
    @Test
    public void test(){
        System.out.println(Daughter.A);
    }
}
