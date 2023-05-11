package com.abhi;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Kunal Kushwaha";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int ron2 = 55;
        int ron3 = 18;

        //Syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int[5];
        // or directly
        int[] rono = {1,2,3,4,5};

        int[] ros; // declaration of array. ros is getting defined in stack.
        ros = new int[5]; // initialisation: actually here object is bing created in the heap memory.

        System.out.println(ros[1]);

        String[] arr = new String[5];
        System.out.println(arr[3]);
    }
}
