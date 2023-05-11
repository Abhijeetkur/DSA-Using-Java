package com.abhi.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5};
        int target = 4;
//        System.out.println(findIndexLast(arr, 4, arr.length-1));
//        findAllIndex(arr, 4, 0);
//        System.out.println(findIndexAll1(arr, target, 0));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr,target, 0,  list);
        System.out.println(ans);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndexLast(arr, target, index - 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        // This is optimized. So, use it.

        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

     static ArrayList<Integer> findIndexAll1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        // This one is not much optimized. So, don't use it.
        if (index == arr.length){
            return list;
        }
        // This will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndexAll1(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
