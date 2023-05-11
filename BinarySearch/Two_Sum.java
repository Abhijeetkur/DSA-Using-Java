package com.abhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = {2, 2, 4, 3, 1, 6, 6, 7, 5, 9, 1, 8, 9};
        int target = 10;
        List<List<Integer>> ans = twoSum(arr, target);
        System.out.println(ans);
    }


    static List<List<Integer>> twoSum(int[] arr, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int start = 0, end = arr.length-1;
        while (start < end){
            if (start != 0 && arr[start] == arr[start-1]){
                start++;
                continue;
            }

            int sum = arr[start] + arr[end];
            if (sum == target){
                List<Integer> subres = new ArrayList<>();
                subres.add(arr[start]);
                subres.add(arr[end]);
                res.add(subres);
                start++;
                end--;
            }else if (sum > target){
                end--;
            }else {
                start++;
            }
        }
        return res;
    }
}
