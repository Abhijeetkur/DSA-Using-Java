package com.abhi;

public class GoOut {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 31; i++){
            if (i%2 == 0){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
