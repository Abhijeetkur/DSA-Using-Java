package com.abhi.easy;

public class PrintNumber {
    public static void main(String[] args) {
        int n = 5;
//        func(n);
        funcRev(n);
//        funcBoth(n);

    }

    static void func(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    static void funcRev(int n) {
        if (n == 0){
            return;
        }
        funcRev(n-1);
        System.out.println(n);
    }

    static void funcBoth(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}
