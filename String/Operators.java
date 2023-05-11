package com.abhi;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1".
        // integer will be converted to Integer that will call toString()

        System.out.println("Abhijeet" + new ArrayList<>());
        System.out.println("Abhijeet" + new Integer(56));

//      System.out.println(new ArrayList<>() + new Integer(56));// this will through error
        System.out.println(new ArrayList<>() + "" +new Integer(56));
    }
}
