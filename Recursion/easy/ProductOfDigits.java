package com.abhi.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 10342;
        int ans = product(n);
        System.out.println(ans);
    }

    static int product(int n) {
        if (n%10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }
}
