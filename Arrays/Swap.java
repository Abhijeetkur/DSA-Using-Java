package com.abhi;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 33, 44, 43, 32};
//        swap(arr,0,4);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        // Two pointer method
        int end = arr.length - 1;
        for (int start = 0; start < end ; start++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
