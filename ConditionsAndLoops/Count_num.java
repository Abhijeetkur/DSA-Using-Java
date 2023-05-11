package com.abhi;

import java.util.Scanner;

public class Count_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.print("Enter digit you want to count: ");
        int n = in.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num%10;
            if(rem == n){
                count++;
            }
            num/=10;
        }
        System.out.println("Enter total number of "+n+" is "+count);
    }
}
