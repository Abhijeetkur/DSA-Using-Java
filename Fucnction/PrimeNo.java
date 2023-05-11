package com.abhi;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        boolean ans = Isprime(n);
        System.out.println(ans);
    }

    static boolean Isprime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num > 2 && num%2 == 0){
            return false;
        }
        if (num == 2) {
            return true;
        }
        int i = 3;
        while (i * i <= num) {
            if (num % i == 0){
                return false;
            }
            i +=2;
        }
        return true;
    }
}