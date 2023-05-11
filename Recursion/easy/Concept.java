package com.abhi.easy;

public class Concept {
    public static void main(String[] args) {
        int n = 5;
        func1(n);
    }

    static void func1(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        func1(n--);
    }

    static void func2(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        func2(--n);
    }
}
