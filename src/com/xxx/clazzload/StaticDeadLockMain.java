package com.xxx.clazzload;

/**
 * 2023/4/25
 * <clinit>方法线程安全问题，产生死锁demo
 **/
class StaticA{
    static{
        try {
            Thread.sleep(1000);
            Class.forName("com.xxx.clazzload.StaticB");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("StaticA init OK");
    }
}
class StaticB{
    static{
        try {
            Thread.sleep(1000);
            Class.forName("com.xxx.clazzload.StaticA");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("StaticB init OK");
    }
}
public class StaticDeadLockMain extends Thread {
    private char flag;
    
    public StaticDeadLockMain(char flag){
        this.flag = flag;
        this.setName("Thread" + flag);
    }
    @Override
    public void run() {
        try {
            Class.forName("com.xxx.clazzload.Static" + flag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "over");
    }
    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadA.start();
        loadB.start();
    }
}
