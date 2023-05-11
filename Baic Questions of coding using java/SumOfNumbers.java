package com.abhi;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0, sumEv = 0, sumOd = 0, i = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number "+i+": ");
        while (in.hasNextInt()){
            i++;
            int num = in.nextInt();
            if (num < 0) {
                sum += num;
            } else if (num%2 == 0 && num !=0) {
                sumEv += num;
            }else if (num%2 != 0){
                sumOd += num;
            }else {
                System.out.println("Sum of negative numbers are "+sum);
                System.out.println("Sum of positive even numbers are "+sumEv);
                System.out.println("Sum of positive odd numbers are "+sumOd);
            }
            System.out.print("Enter number "+i+": ");
        }
    }
}
