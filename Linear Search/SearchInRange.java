package com.abhi;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target, 2, 7);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //this line will execute if none of above return statements have executed
        // hence target element is not found
        return -1;
    }
}
