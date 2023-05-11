package com.abhi;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String department = in.next();
        switch (EmpID){
            case 1:
                System.out.println("Kunal Khushwaha");
                break;
            case 2:
                System.out.println("Abhijeet Kumar");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
