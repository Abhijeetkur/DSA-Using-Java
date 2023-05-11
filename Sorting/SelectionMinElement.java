package com.abhi;

import java.util.Arrays;

public class SelectionMinElement { // Selection sort using minimum element
    public static void main(String[] args) {
        int[] arr1 = {35, 25, 45, 65};
        SelectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int first = i + 1;
            int minIndex = getIndex(arr, first, arr.length-1);
            swap(arr, minIndex, i);
        }
    }

    static int getIndex(int[] arr, int start, int end){
        int min = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
}
