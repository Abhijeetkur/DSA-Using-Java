package com.abhi;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean ans = fun();
        System.out.println(ans);
    }

    static boolean fun() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x < 0){
            return false;
        }else if(x > 0 && x < 10){
            return true;
        }
        int a = 0, temp = x;
        while(x > 0){
            int rem = x%10;
            a = a*10+rem;
            x /= 10;
        }
        if(a == temp){
            return true;
        }else{
            return false;
        }
    }
}
