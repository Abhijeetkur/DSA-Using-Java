package com.abhi;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //Swap numbers code
//        temp = a;
//        a = b;
//        b = a;
        swap(a, b);
        System.out.println(a+ " "+b);

        String name = "Kunsl Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Rahul Rana";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
}
