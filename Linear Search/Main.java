package com.abhi;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }
    // search in the array: return index if a item found
    // return -1 if item not found
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return 1;
            }
        }
        //this line will execute if none of above return statements have executed
        // hence target element is not found
        return -1;
    }

    //return element if item found
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of above return statements have executed
        // hence target element is not found
        return -1;
    }
    //return true or false if item found
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        //run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of above return statements have executed
        // hence target element is not found
        return false;
    }
}
