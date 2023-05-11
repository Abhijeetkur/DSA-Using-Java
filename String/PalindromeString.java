package com.abhi;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            char start = str.charAt(i);
            int end = str.charAt(str.length() - i - 1);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
