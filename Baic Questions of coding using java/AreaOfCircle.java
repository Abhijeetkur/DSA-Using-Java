package com.abhi;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = in.nextInt();
        float Area = 3.14f*radius*radius;
        System.out.println("Area of circle is: "+Area);
    }
}
