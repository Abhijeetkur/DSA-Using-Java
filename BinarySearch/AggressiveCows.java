package com.abhi;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int cows = 3;
        int ans = search(arr, cows);
        System.out.println(ans);
    }

    static int search(int[] arr, int cows) {
        int ans = 0;
        int low = 1, high = arr[arr.length - 1] - arr[0];
        while (low <= high){
            int mid = low + (high - low)/2;
            if (canPlaceCow(arr, mid, cows)){
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static boolean canPlaceCow(int[] arr, int mid, int cows) {
        int cord = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++){
            if (arr[i]-cord >= mid){
                count++;
                cord = arr[i];
            }
        }
        return count == cows;
    }
}
