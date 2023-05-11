package com.abhi;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        int[] ans = countSort(arr, 3, 9);
        System.out.println(Arrays.toString(ans));
    }

    static int[] countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] farr = new int[range];
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            farr[idx]++;
        }

        for (int i = 1; i < farr.length; i++) {
            farr[i] = farr[i] + farr[i-1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int pos = farr[arr[i] - min];
            int idx = pos - 1;
            ans[idx] = arr[i];
            farr[arr[i] - min]--;
        }
        return ans;
    }
}
