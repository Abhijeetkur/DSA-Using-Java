package com.abhi;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {4, 234, 3342, 1, 53, 532, 143432};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr){
            if (val > max){
                max = val;
            }
        }
        int exp = 1;
        while (exp <= max){
            countSort(arr, exp);
            exp = exp*10;
        }
    }

    static void countSort(int[] arr, int exp) {
        int[] farr = new int[10];
        for (int i = 0; i < arr.length; i++){
            int idx = (arr[i]/exp)%10;
            farr[idx]++;
        }
        for (int i = 1; i < farr.length; i++){
            farr[i] = farr[i] + farr[i-1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--){
            int pos = farr[(arr[i]/exp)%10] - 1;
            ans[pos] = arr[i];
            farr[(arr[i]/exp)%10]--;
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
}
