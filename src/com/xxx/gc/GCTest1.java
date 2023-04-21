package com.xxx.gc;

/**
 * 2023/4/21
 * 测试finalize()使对象复活的情况，以及finalize()只能被调用一次
 * finalization机制
 **/

public class GCTest1 {
    // 类变量，属于GC Roots的一部分
    public static GCTest1 canReliveObj;

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("调用当前类重写的finalize()方法");
//        canReliveObj = this;
//    }

    public static void main(String[] args) throws InterruptedException {
        canReliveObj = new GCTest1();
        canReliveObj = null;
        System.gc();
        System.out.println("-----------------第一次gc操作------------");
        // 因为Finalizer线程的优先级比较低，暂停2秒，以等待它
        Thread.sleep(2000);
        if (canReliveObj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }

        System.out.println("-----------------第二次gc操作------------");
        canReliveObj = null;
        System.gc();
        // 下面代码和上面代码是一样的，但是 canReliveObj却自救失败了
        Thread.sleep(2000);
        if (canReliveObj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }
    }
}
