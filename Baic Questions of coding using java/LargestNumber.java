package com.abhi;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int largest = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number "+i+": ");
        while(input.hasNextInt()){
            i++;
            int num = input.nextInt();
            if(num>largest){
                largest = num;
            }
            if(num == 0){
                System.out.println("lar: "+largest);
                break;
            }
            System.out.print("Enter number "+i+": ");
        }
    }
}
