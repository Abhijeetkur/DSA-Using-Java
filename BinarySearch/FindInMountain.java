package com.abhi;

public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 1};
        int target = 1;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakElement(arr);
        int firstTry = binarySearch(arr, target,0, peak);
        if (firstTry != -1){
            return firstTry;
        }else {
            return OrderAgnostic(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int OrderAgnostic(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start]<arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (arr[mid]>target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (arr[mid]>target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = start - 1;
            }else {
                start = mid + 1;
            }
        }
        return - 1;
    }


    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
