package com.abhi;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, count = 2;
        while (count <= n){
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println("Fibbonaci Series is: " + b);
    }
}
