package com.abhi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        for(int i = num1;i<num2;i++){
            int temp,sum=0, rem;;
            temp = i;
            while(temp>0){
                rem = temp%10;
                sum+=(rem*rem*rem);
                temp = temp/10;
            }
            if(sum == i){
                System.out.println(i+" is armstrong Number.");
            }
            }
        }
}
