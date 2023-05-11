package com.abhi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);
////        System.out.println(list.contains(6655));
//
//        System.out.println(list);
        list.add(0,9);
//        list.remove(5);
//        System.out.println(list);

        // input
//        for (int i = 0; i < 5; i++){
//            list.add(in.nextInt());
//        }
//
//        // get item at any index
//        for (int i = 0; i < 5; i++){
//            System.out.print(list.get(i)); // pass index here, list[index will not work here
//        }

        System.out.println(list);
    }
}
