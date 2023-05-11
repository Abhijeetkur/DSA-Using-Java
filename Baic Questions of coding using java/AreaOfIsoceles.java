package com.abhi;

import java.util.Scanner;

public class AreaOfIsoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose options: ");
        System.out.println("A or a by using base and height.");
        System.out.println("B or b by using only sides.");
        System.out.println("C or c by using two sides and angle between them.");
        char op = in.next().trim().charAt(0);
        if(op == 'a' || op =='A' ){
            System.out.println("Enter base: ");
            float base = in.nextFloat();
            System.out.println("Enter height: ");
            float height = in.nextFloat();
            float Area = 0.5f*base*height;
            System.out.println("Area of isoceles triangle is: "+Area);
        } else if (op == 'b' || op == 'B') {
            System.out.println("Enter Side a: ");
            float a = in.nextFloat();
            System.out.println("Enter Side b: ");
            float b = in.nextFloat();
            float Area = (float) (0.5f*((Math.pow(a,2)-Math.pow(b,2))/4)*b);
            System.out.println("Area of isoceles triangle is: "+Area);
        }
        else if (op == 'c' || op == 'C'){
            System.out.println("Enter angle a: ");
            float a = in.nextFloat();
            System.out.println("Enter Side b: ");
            float b = in.nextFloat();
            System.out.println("Enter Side c: ");
            float c = in.nextFloat();
            float Area = (float) (0.5f*b*c*(Math.sin(Math.toRadians(a))));
            System.out.println("Area of isoceles triangle is: "+Area);
        }
        else {
            System.out.println("Invalid Input!");
        }
    }
}
