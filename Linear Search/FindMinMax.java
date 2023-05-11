package com.abhi;

public class FindMinMax {
    public static void main(String[] args) {
        int[] nums = {18, 12, 7, 3, 14, 28};
        int ans = max(nums);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
