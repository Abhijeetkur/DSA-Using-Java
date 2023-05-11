package com.abhi;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = input.nextInt();

        int min=num1;
        if(num1<num2) {
            min = num1;
        }
        else {
            min = num2;
        }
        int i = 1, hcf=0;
        while(i<=min){
            if(num1%i==0 && num2%i==0)
                hcf = i;
            i++;
        }
        System.out.println("Hcf of "+num1+" and "+num2+" is "+hcf);
    }
}
