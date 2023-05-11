package com.abhi;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Pv, i, n;
        System.out.println("Present Value: ");
        Pv = in.nextDouble();
        System.out.println("Interest paid: ");
        i = in.nextInt();
        System.out.println("The times in years the investment is held: ");
        n = in.nextInt();

        double Fv = (Pv*(Math.pow((1 + i/100),n)));
        System.out.println("The future investment value is "+ Fv);
    }
}
