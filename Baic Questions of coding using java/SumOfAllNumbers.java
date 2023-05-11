package com.abhi;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number "+i+": ");
        while(input.hasNextInt()){
            i++;
            int num = input.nextInt();
            if(num == 0){
                System.out.println("Total sum is: "+sum);
                break;
            }
            System.out.print("Enter number "+i+": ");
            sum += num;
        }
    }
}
