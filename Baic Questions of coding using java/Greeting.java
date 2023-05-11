package com.abhi;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.next();

        System.out.println("Hello, "+name+"!");
    }
}
