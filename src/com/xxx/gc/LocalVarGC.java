package com.xxx.gc;

/**
 * 2023/4/22
 * 测试System.gc();
 **/

public class LocalVarGC {
    public void localVarGC1(){
        byte[] buffer = new byte[10*1024*1024];
        System.gc();
    }
    public void localVarGC2(){
        byte[] buffer = new byte[10*1024*1024];
        buffer = null;
        System.gc();
    }
    public void localVarGC3(){
        {
            byte[] buffer = new byte[10*1024*1024];
        }
        System.gc();
    }

    //可以进行回收，在编译期 int i = 1把buffer给替换了
    public void localVarGC4(){
        {
            byte[] buffer = new byte[10*1024*1024];
        }
        int i = 1;
        System.gc();
    }
    //可以回收
    public void localVarGC5(){
        localVarGC1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.localVarGC5();
    }
}
