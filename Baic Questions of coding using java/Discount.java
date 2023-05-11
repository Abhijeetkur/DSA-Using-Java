package com.abhi;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter market price: ");
        double marPrice = in.nextDouble();
        System.out.print("Enter discount percentage: ");
        double disPer = in.nextDouble();

        double discount = (marPrice*disPer)/100;

        System.out.println("Discount on product is "+discount);
    }
}
