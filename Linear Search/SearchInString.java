package com.abhi;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
//        boolean ans = search(name, target);
        //System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }

        }
        return false;
    }
}
