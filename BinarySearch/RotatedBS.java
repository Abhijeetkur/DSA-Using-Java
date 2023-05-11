package com.abhi;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        int target = 3;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }
    static boolean search(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);

        //if you did not find a pivot, it means the array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        //if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target){
            return true;
        }

        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot+1,arr.length - 1);
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return true;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases are here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // Note: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
                }
            }
        return -1;
    }
}
