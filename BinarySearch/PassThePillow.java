package com.abhi;

public class PassThePillow {
    public static void main(String[] args) {
        int n = 4, time = 5;
        int ans = pillow(n, time);
        System.out.println(ans);
    }
    static int pillow(int n, int time){
        int divisor = n - 1;
        int group = time / divisor;
        int offset = time % divisor;
        int ans  = group%2 == 0 ? 1 + offset : n - offset;
        return ans;
    }
}
