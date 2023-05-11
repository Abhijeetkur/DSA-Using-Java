package com.abhi;

import java.util.Scanner;

public class Usd_To_Rupees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in dollar: ");
        float dollar = in.nextFloat();

        float rupees = dollar*78.27f;
        System.out.println(dollar+" dollar"+" in rupees is "+rupees);
    }
}
