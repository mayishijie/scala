package com.mayi.scala;

/**
 * Author: Felix
 * Date: 2020/4/28
 * Desc:  演示Java中方法链式调用以及传参
 */
public class TestMethodInvoke {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        int a = 10;
        m2(a);
    }

    private static void m2(int a) {
        m3(a);
    }
    private static void m3(int a) {
        m4(a);
    }
    private static void m4(int a) {
        System.out.println(a);
    }

}
