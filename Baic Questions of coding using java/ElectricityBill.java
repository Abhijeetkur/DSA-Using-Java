package com.abhi;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter units: ");
        long unit = in.nextLong();
        double billpay = 0;
        if (unit < 100){
            billpay = unit*1.20;
        } else if (unit < 300) {
            billpay = 100*1.2 + (unit - 100)*2;
        } else if (unit > 300) {
            billpay = 100*1.2 + 200*2 + (unit - 300)*3;
        } else{
            billpay = 0;
        }
        System.out.println("The elctricity bill for "+unit+" is "+billpay);
    }
}

