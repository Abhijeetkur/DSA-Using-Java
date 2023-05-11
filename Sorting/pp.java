package com.abhi;

import java.util.Arrays;

public class pp {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 5};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        for (int k=0; k<nums.length; k++){
            if (max1 < nums[k]){
                max2 = max1;
                j = i;
                max1 = nums[k];
                i = k;
            }else if (max2 < nums[k]){
                max2 = nums[k];
                j = k;
            }
        }

        return (nums[i]-1)*(nums[j]-1);
    }
}
