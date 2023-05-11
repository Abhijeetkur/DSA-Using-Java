package com.abhi;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your rollno: ");
//        int rollno = input.nextInt();
//        System.out.println("Your Rollno is: " + rollno);
//
        String name = input.next();
        System.out.println("Your name is: " + name);

        float marks = input.nextFloat();
        System.out.println("Your marks is: " + marks);
    }
}
