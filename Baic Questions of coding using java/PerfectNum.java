package com.abhi;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = in.nextInt();
        System.out.print("Enter end: ");
        int end = in.nextInt();
        for ( int n = start; n <=end; n++){
            isPerfect(n);
            if (isPerfect(n)){
                System.out.println(n + " is perfect number.");
            }
        }
    }

    static boolean isPerfect(int num) {
        int sum = 1;
        if (num == 1){
            return false;
        }
        for (int i = 2; i*i <= num; i++){
            if (num%i == 0){
                if (i*i == num){
                    sum += i;
                }else {
                    sum = sum + i + num/i;
                }
            }
        }
        return sum == num;
    }
}
