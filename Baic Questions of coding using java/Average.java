package com.abhi;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total count of number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += in.nextInt();
        }
        float avg = sum/n;
        System.out.println("Average is "+avg);
    }
}
