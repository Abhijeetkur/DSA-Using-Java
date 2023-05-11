package com.abhi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax for for loop:
            for(initialisation; condition; increment/decrement){
                //body
            }
         */
        // Q: Print number from 1 to 5
//        for(int num = 1; num <= 5; num++){
//            System.out.println(num);
//        }

        // Print number from 1 to n
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = input.nextInt();
//        for(int num = 1; num <= n; num++){
//            System.out.println("Hello World!");
//        }

        /*
            While loop Syntax:
                While(conditon){
                    //body
                }
         */
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num++;
//        }
//    }

        /*
            do while loop syntax:
            do{
                //body
             } while(condition);
         */

        int n = 1;
        do {
            System.out.println("Hello world!");
        } while (n != 1);
    }
}
