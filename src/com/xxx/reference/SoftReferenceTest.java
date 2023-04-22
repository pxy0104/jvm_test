package com.xxx.reference;

import java.lang.ref.SoftReference;

/**
 * 2023/4/22
 * 测试软引用
 * -Xms10m -Xmx10m -XX:+PrintGCDetails
 **/

public class SoftReferenceTest {

    public static class User{
        public int id;
        public String name;
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        //创建软引用
        SoftReference<User> userSoftReference = new SoftReference<>(new User(1, "zs"));
        System.out.println(userSoftReference.get());
        System.gc(); //gc之后
        //获取强引用对象
        System.out.println(userSoftReference.get());

        try {
            //-Xms10m -Xmx10m 堆空间不足，清除软引用可达对象
//            byte[] bytes = new byte[7*1024*1024];
            byte[] bytes = new byte[7168*1024 + 3 - 1024*605];
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(userSoftReference.get());
        }
    }

}
