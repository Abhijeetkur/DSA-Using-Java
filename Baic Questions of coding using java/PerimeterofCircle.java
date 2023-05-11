package com.abhi;

import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = in.nextFloat();

        float perimeter = (float) (2*3.14*radius);
        System.out.println("Perimeter of circle is: "+ perimeter);
    }
}
