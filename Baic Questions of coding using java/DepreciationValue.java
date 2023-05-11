package com.abhi;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        float v1, r, t;
        Scanner in = new Scanner(System.in);
        System.out.print("Value at a certain time: ");
        v1 = in.nextFloat();
        System.out.print("Rate of depreciation per year: ");
        r = in.nextFloat();
        System.out.print("Time: ");
        t = in.nextFloat();

        float v2 = (float) (v1*(Math.pow((1-r/100),t)));

        System.out.println("Value at the end of "+t+" years is "+v2);
    }
}
