package com.abhi;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'f', 'j'};
        char target = 'a';
        char ans = Letters(letters, target);
        System.out.println(ans);
    }

    static char Letters(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target >= letters[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return letters[start%letters.length];
    }
}