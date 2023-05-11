package com.abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        List<Integer> pivot = findPivot(nums);
        System.out.println(pivot);
    }
    static List<Integer> findPivot(int[] nums) {
        int n = nums.length;

        List<Integer> clone = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int num: nums) clone.add(num);

        Collections.sort(clone);
        System.out.println(Arrays.toString(new List[]{clone}));

        for(int i=0;i<n;i++){
            int pos = binarySearch(clone,nums[i]);
            ans.add(pos);
            System.out.println(Arrays.toString(new List[]{clone}));
            clone.remove(pos);
            System.out.println(Arrays.toString(new List[]{clone}));
        }

        return ans;
        }

    static int binarySearch(List<Integer> clone, int target) {
        int l=0;
        int h = clone.size();

        while(l<h){
            int m =  l + (h-l)/2;
            if(clone.get(m)<target){
                l = m+1;
            }else{
                h = m-1;
            }
        }

        return l;
    }
}
