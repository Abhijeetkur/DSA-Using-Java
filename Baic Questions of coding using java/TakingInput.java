package com.abhi;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number"+i+": ");
        
        while(true){
            if (input.hasNextInt()){
                i++;
                System.out.print("Enter number"+i+": ");
                int num = input.nextInt();
                sum += num;
            } else{
                char ch = input.next().trim().charAt(0);
                if(ch == 'x' || ch == 'X'){
                    System.out.println("Total is: "+sum);
                    break;
                }else {
                    System.out.println("Invalid input!!");
                    System.out.println("Please enter any number or X or x");
                }

            }

        }
    }
}
