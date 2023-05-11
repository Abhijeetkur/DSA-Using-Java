package com.abhi;

public class DivideChocolate {
    public static void main(String[] args) {
        int[] sweetness = {1,2,3,4,5,6,7,8,9};
        int K = 5;
        int ans = maximizeSweetness(sweetness, K);
        System.out.println(ans);
    }

    static int maximizeSweetness(int[] nums, int m) {
        m++;
        long l = Integer.MAX_VALUE, r = 0;
        for(int n : nums) {
            r += n;
            l = Math.min(l, n);
        }
        while(l+1 < r) {
            long mid = l + (r-l) / 2;
            if(canSplit(nums, m, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if(canSplit(nums, m, r)) return (int)r;
        else return (int)l;
    }

    static boolean canSplit(int[] nums, int m, long target) {
        long sum = 0, cnt = 0;
        for(int n : nums) {
            sum += n;
            if(sum >= target) {
                sum = 0;
                cnt++;
            }
        }
        return cnt >= m;
    }
}
