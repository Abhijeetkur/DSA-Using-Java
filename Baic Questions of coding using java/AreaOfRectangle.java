package com.abhi;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = in.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = in.nextFloat();
        float Area = length*breadth;
        System.out.println("Area of Rectangle is: "+Area);
    }
}
