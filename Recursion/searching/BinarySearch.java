package com.abhi.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5, 6};
        int start = 0, end = arr.length-1;
        int target = 6;
        System.out.println(search(arr,target,  start, end));
    }

    static int search(int[] arr, int target, int start, int end){
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return search(arr, target, start, mid - 1);
            }
            return search(arr, target, mid + 1, end);
        }
        return -1;
    }
}
