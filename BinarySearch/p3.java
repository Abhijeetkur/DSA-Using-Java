package com.abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> ans = summaryRanges(nums);
        System.out.println(ans);
    }
    static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0){
            return ans;
        }
        if (nums.length == 1){
            ans.add(""+nums[0]);
            return ans;
        }
        int start = 0, i = 0;
        while (start < nums.length && i < nums.length){
            if(i < nums.length - 1 && nums[i]+1 == nums[i+1]){
                i++;
            }else{
                String strans = "";
                if (start == i){
                    strans += nums[i];
                }else{
                    strans = nums[start] + "->" + nums[i];
                }
                ans.add(strans);
                start = i+1;
                i++;
            }
        }
        return ans;
    }
}
