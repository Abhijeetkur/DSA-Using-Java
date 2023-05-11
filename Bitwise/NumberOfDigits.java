package com.abhi;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 3328;
        int b = 10;
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}
