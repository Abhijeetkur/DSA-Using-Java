package com.abhi.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1};
        bubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int row, int col){
        if (row == 0){
            return;
        }
        if (row > col){
            if (arr[col] > arr[col + 1]){
                //swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row, col+1);
        }
        if (row == col){
            bubbleSort(arr, row - 1, 0);
        }
    }
}
