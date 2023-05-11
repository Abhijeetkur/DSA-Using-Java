package com.abhi;

public class CeilingAndFloor {
    public static void main(String[] args) {
//        int[] arr = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int[] arr = {2, 3, 4, 5, 6, 6, 7, 34, 65};
        int target = 21;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
        int ans1 = Floor(arr, target);
        System.out.println(ans1);
    }

    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }

    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
