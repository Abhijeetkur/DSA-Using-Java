package com.abhi.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subsetDuplicates(arr);
        List<List<Integer>> ans = subsetHelper(arr, arr.length);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    /* When there is no duplicates */
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    /* When there duplicates */
    static List<List<Integer>> subsetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            int start = 0;
            if (i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    // using recursion
    static List<List<Integer>> subsetHelper(int[] arr, int n) {
        if (n == 0) {
            List<List<Integer>> emptySet = new ArrayList<>();
            emptySet.add(new ArrayList<>());
            return emptySet;
        }

        List<List<Integer>> subsets = subsetHelper(arr, n - 1);
        int num = arr[n - 1];
        int nSubsets = subsets.size();
        for (int i = 0; i < nSubsets; i++) {
            List<Integer> subset = new ArrayList<>(subsets.get(i));
            subset.add(num);
            subsets.add(subset);
        }
        return subsets;
    }
}
