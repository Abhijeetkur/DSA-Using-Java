package com.abhi;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,32,2,3,2,2);
        fun2(39,2,"Abhijeet","Prince");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(int a, int b, String ...v){
        System.out.println(Arrays.toString(v)+a+b);
    }
}
