package com.abhi;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = in.nextFloat();
        System.out.print("Enter Height: ");
        float height = in.nextFloat();

        float Area = base*height;
        System.out.println("Area of Parallelogram is: "+Area);
    }
}
