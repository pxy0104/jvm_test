package com.xxx.compiler;

/**
 * 2023/4/19
 * -Xint：完全采用解释器模式执行程序；  1224
 * -Xcomp：完全采用即时编译器模式执行程序。如果即时编译出现问题，解释器会介入执行 2
 * -Xmixed：采用解释器+即时编译器的混合模式共同执行程序。 2
 **/

public class CompilerTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        PrimeNumber(10000000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    public static void PrimeNumber(int count) {
        for (int n = 0; n < count; n++) {
            label:for (int i = 2; i <= 100; i++) {
                for (int j = 2; j <= Math.sqrt(j); j++) {
                    if (i % j == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
