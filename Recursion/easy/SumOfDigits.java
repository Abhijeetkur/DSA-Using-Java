package com.abhi.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 13423;
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n) {
        if (n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
