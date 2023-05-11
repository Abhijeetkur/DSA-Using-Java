package com.abhi;

public class p2 {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};
        boolean ans = canBeEqual(target, arr);
        System.out.println(ans);
    }

    static boolean canBeEqual(int[] target, int[] arr){
        int[] df = new int[1001];
        for (int i = 0; i < target.length; i++){
            df[target[i]]++;
            df[arr[i]]--;
        }

        for (int i = 1; i < 1001; i++){
             if (df[i] != 0){
                 return false;
             }
        }
        return true;
    }
}
