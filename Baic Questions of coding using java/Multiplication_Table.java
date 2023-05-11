package com.abhi;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int i = 1;
        while(i<=10)
        {
            int multi = number*i;
            System.out.println(number + " * " + i + " = " + multi);
            i++;
        }
    }
}
