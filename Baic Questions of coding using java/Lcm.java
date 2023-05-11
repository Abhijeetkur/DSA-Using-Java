package com.abhi;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number2: ");
        int num2 = input.nextInt();

        int Lcm=0;
        if(num1>num2)
            Lcm=num1;
        else
            Lcm=num2;

        while(true){
            if(Lcm%num1==0 && Lcm%num2==0) {
                System.out.println("Lcm of " + num1 + " and " + num2 + " is " + Lcm);
                break;
            }
            Lcm++;
        }
    }
}
