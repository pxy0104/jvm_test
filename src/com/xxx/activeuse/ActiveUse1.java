package com.xxx.activeuse;

import org.junit.Test;

import java.io.*;

/**
 * 2023/4/25
 **/

class Order implements Serializable {
    private int a;
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    static {
        System.out.println("Order类的初始化过程");
    }
}

public class ActiveUse1 {
    public static void main(String[] args) {
        Order order = new Order();
    }
    //序列化对象
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order.dat"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("order.dat"));
            Order order= (Order) ois.readObject();
            order.setA(1);
            System.out.println(order.getA());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
}
