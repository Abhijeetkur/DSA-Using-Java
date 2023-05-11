package com.abhi;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = in.nextFloat();
        System.out.print("Enter Height: ");
        float height = in.nextFloat();

        float Area = 0.5f*base*height;
        System.out.println("Area of Triangle is: "+Area);
    }
}
