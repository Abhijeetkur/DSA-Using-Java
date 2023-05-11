package com.abhi;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        String original, b = "";
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        int i = original.length();
        while(i>0){
            b += original.charAt(i-1);
            i+=-1;
        }
        if (b.equals(original)){
            System.out.println("String is palindrome.");
        }else {
            System.out.println("String is not palindrome");
        }

    }
}
