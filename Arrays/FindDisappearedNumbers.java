package com.abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] nums){
        int idx = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0){
                idx = -nums[i]-1;
            }else {
                idx = nums[i]-1;
            }
            if (nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}

