package com.abhi;

public class SetBits {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
//        while (n > 0){
//            System.out.println(Integer.toBinaryString(-n));
//            System.out.println(Integer.toBinaryString(n & -n));
//            count++;
//            n -= (n & -n);
//            System.out.println(Integer.toBinaryString(n));
//        }

        while (n > 0){
            System.out.println(Integer.toBinaryString(n-1));
            count++;
            n = n & (n-1);
            System.out.println(Integer.toBinaryString(n));
        }
        System.out.println(count);
    }
}
