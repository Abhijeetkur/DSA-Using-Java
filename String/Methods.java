package com.abhi;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.toLowerCase();
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
