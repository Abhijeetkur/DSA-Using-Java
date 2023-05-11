package com.abhi;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
//        int[][] arr = new int[3][3];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.print(arr.length); // no of rows
        // input

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = in.nextInt();
            }
        }
         //output
//        }for (int row = 0; row < 3; row++){
//            for (int col = 0; col < 3; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //Output
//        for (int row = 0; row < 3; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
