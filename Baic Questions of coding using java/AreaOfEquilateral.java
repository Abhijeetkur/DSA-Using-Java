package com.abhi;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle: ");
        float a = in.nextFloat();
        float Area = (float) (Math.pow(3,0.5)/4*Math.pow(a,2));

        System.out.println("Area of Equilateral Triangle is: "+Area);
    }
}
