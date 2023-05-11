package com.abhi;

import java.awt.geom.Area;
import java.util.Scanner;

public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of side: ");
        float a = in.nextFloat();
        float perimeter = 3*a;
        System.out.println("Area of triangle is: "+perimeter);
    }
}
