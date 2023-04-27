package com.xxx.clazzload;

/**
 * 2023/4/27
 * 隐式加载，显式加载
 *
 **/

public class UserTest {
    public static void main(String[] args) {
        User user = new User();//隐式加载
        try {
            Class<?> clazz = Class.forName("com.xxx.clazzload.User");//显式加载
//            User user1 = (User) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
