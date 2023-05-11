package com.abhi;


import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(2,3);
        fun("Abhijeet","Kumar");
    }
    static void fun(int ...b){
        System.out.println(Arrays.toString(b));
    }
    static void fun(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
