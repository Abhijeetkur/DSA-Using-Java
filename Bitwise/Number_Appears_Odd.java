package com.abhi;

public class Number_Appears_Odd {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int ans = check(arr);
        System.out.println(ans);
    }

    static int check(int[] nums){
        int ans = 0;
        for(int i=0; i<8; i++) {
            int sum = 0;
            for(int temp : nums) {
                if(((temp>>i)&1)==1) {
                    sum++;
                }
            }
            sum %= 3;

            if (sum != 0){
                ans = ans | sum << i;
            }

        }
        return ans;
    }
}
