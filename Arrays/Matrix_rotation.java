package com.abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix_rotation {
    static void rotate(int[][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        System.out.println("Transpose");
        for (int i = 0; i < mat.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < mat[i].length; j++) { //this equals to the column in each row.
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }

        for (int[] arr : mat){
            int end = mat.length - 1;
            for (int start = 0; start < end; start++){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end --;
            }
        }
        System.out.println("flipped");
        for (int i = 0; i < mat.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < mat[i].length; j++) { //this equals to the column in each row.
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
    static boolean check(int[][] mat, int[][] target){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                System.out.println(true);
                break;
            }
            rotate(mat);
        }
    }
}
