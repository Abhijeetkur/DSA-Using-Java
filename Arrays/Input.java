package com.abhi;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 34;
        arr[3] = 33;
        arr[4] = 32;

        // [3, 2, 34, 33, 32]
//        System.out.println(arr[3]);

        // input using loops
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));
//        //output using for loops
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

//        for(int j : arr){ // for every element in array, print the element
//            System.out.print(j + " "); // here j represents element of array
//        }
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Abhijeet";
        for (String i : str){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(str));
    }
}
