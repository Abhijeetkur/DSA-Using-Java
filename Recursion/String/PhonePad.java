package com.abhi.String;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
//        int ans = padCount("", "12");
//        System.out.println(ans);
        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> list = new ArrayList<>();
        System.out.println(padArgumentRet("", "23", str, list));
    }

    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padRet(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> padArgumentRet(String p, String up, String[] str, ArrayList<String> ans){
        if (up.isEmpty()){
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '0';

        for (int i = 0; i < str[digit].length() ; i++) {
            char ch = str[digit].charAt(i);
            padArgumentRet(p + ch, up.substring(1), str, ans);
        }
        return ans;
    }
}
