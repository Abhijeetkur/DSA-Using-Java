package com.abhi;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        float P = in.nextFloat();
        System.out.print("Enter Rate of interest: ");
        float R = in.nextFloat();
        System.out.print("Enter Time Period(In Year): ");
        float T = in.nextFloat();

        float S_I = (P*R*T)/100;

        System.out.println("Simple Interest is: "+S_I);
    }
}
