package com.abhi;

import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int idx = 0;
        while (idx < nums.length){
            int correct = nums[idx]-1;
            if(nums[idx] != nums[correct]){
                swap(nums, idx, correct);
            }else{
                idx++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == i){
                return new int[]{i, i+1};
            }else if(nums[i] != i+1){
                return new int[]{nums[i], i+1};
            }
        }
        return null;
    }
    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
