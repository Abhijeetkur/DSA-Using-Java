package com.abhi;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter diagonal 1: ");
        float d1 = in.nextFloat();
        System.out.print("Enter diagonal 2: ");
        float d2 = in.nextFloat();

        float Area = 0.5f*d1*d2;

        System.out.println("Area of diagonal is: "+Area);
    }
}
