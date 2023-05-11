package com.abhi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans1 = sum3(10, 3);
        System.out.println(ans1);
//        sum();
    }
    /*
        return_type name(){
            //body
            return statement;
        }
     */
    static int sum3(int a, int b){
        int sum = a +b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
