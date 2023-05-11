package com.abhi;



public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 33, 43, 32};
        int ans = maxRange(arr);
        System.out.println(ans);
    }
    static int maxRange(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        if(arr== null){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
