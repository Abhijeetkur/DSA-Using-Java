package com.abhi;

public class SpecialArrayX {
    public static void main(String[] args) {
        int[] nums= {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        int ans = func(nums);
        System.out.println(ans);
    }

    static int func(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums){
            max = Math.max(max, num);
        }
        for (int x = 0; x <= max; x++){
            if (x==0 && nums.length > 0){
                continue;
            }
            int c = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[j]>=x){
                    c++;
                }
            }
            if (c > x){
                continue;
            }else if(c == x){
                return x;
            }
        }
        return -1;
    }
}
